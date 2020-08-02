<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="活动类型" prop="actypeId">
      <el-input v-model="dataForm.actypeId" placeholder="活动类型"></el-input>
    </el-form-item>
    <el-form-item label="活动标题" prop="title">
      <el-input v-model="dataForm.title" placeholder="活动标题"></el-input>
    </el-form-item>
    <el-form-item label="活动内容" prop="acContent">
      <el-input v-model="dataForm.acContent" placeholder="活动内容"></el-input>
    </el-form-item>
    <el-form-item label="活动地址" prop="acAddress">
      <el-input v-model="dataForm.acAddress" placeholder="活动地址"></el-input>
    </el-form-item>
    <el-form-item label="活动容纳人数" prop="acAmount">
      <el-input v-model="dataForm.acAmount" placeholder="活动容纳人数"></el-input>
    </el-form-item>
    <el-form-item label="活动预算" prop="acBudget">
      <el-input v-model="dataForm.acBudget" placeholder="活动预算"></el-input>
    </el-form-item>
    <el-form-item label="活动开始时间" prop="timeStart">
      <el-input v-model="dataForm.timeStart" placeholder="活动开始时间"></el-input>
    </el-form-item>
    <el-form-item label="活动结束时间" prop="timeEnd">
      <el-input v-model="dataForm.timeEnd" placeholder="活动结束时间"></el-input>
    </el-form-item>
    <el-form-item label="逻辑删除字段[0不显示，1显示]" prop="showStatus">
      <el-input v-model="dataForm.showStatus" placeholder="逻辑删除字段[0不显示，1显示]"></el-input>
    </el-form-item>
    <el-form-item label="排序字段" prop="sort">
      <el-input v-model="dataForm.sort" placeholder="排序字段"></el-input>
    </el-form-item>
    <el-form-item label="创建人名称" prop="createName">
      <el-input v-model="dataForm.createName" placeholder="创建人名称"></el-input>
    </el-form-item>
    <el-form-item label="创建人ID" prop="createBy">
      <el-input v-model="dataForm.createBy" placeholder="创建人ID"></el-input>
    </el-form-item>
    <el-form-item label="创建时间" prop="createTime">
      <el-input v-model="dataForm.createTime" placeholder="创建时间"></el-input>
    </el-form-item>
    <el-form-item label="更新人名称" prop="updateName">
      <el-input v-model="dataForm.updateName" placeholder="更新人名称"></el-input>
    </el-form-item>
    <el-form-item label="更新人ID" prop="updateBy">
      <el-input v-model="dataForm.updateBy" placeholder="更新人ID"></el-input>
    </el-form-item>
    <el-form-item label="更新时间" prop="updateTime">
      <el-input v-model="dataForm.updateTime" placeholder="更新时间"></el-input>
    </el-form-item>
    </el-form>
    <span slot="footer" class="dialog-footer">
      <el-button @click="visible = false">取消</el-button>
      <el-button type="primary" @click="dataFormSubmit()">确定</el-button>
    </span>
  </el-dialog>
</template>

<script>
  export default {
    data () {
      return {
        visible: false,
        dataForm: {
          id: 0,
          actypeId: '',
          title: '',
          acContent: '',
          acAddress: '',
          acAmount: '',
          acBudget: '',
          timeStart: '',
          timeEnd: '',
          showStatus: '',
          sort: '',
          createName: '',
          createBy: '',
          createTime: '',
          updateName: '',
          updateBy: '',
          updateTime: ''
        },
        dataRule: {
          actypeId: [
            { required: true, message: '活动类型不能为空', trigger: 'blur' }
          ],
          title: [
            { required: true, message: '活动标题不能为空', trigger: 'blur' }
          ],
          acContent: [
            { required: true, message: '活动内容不能为空', trigger: 'blur' }
          ],
          acAddress: [
            { required: true, message: '活动地址不能为空', trigger: 'blur' }
          ],
          acAmount: [
            { required: true, message: '活动容纳人数不能为空', trigger: 'blur' }
          ],
          acBudget: [
            { required: true, message: '活动预算不能为空', trigger: 'blur' }
          ],
          timeStart: [
            { required: true, message: '活动开始时间不能为空', trigger: 'blur' }
          ],
          timeEnd: [
            { required: true, message: '活动结束时间不能为空', trigger: 'blur' }
          ],
          showStatus: [
            { required: true, message: '逻辑删除字段[0不显示，1显示]不能为空', trigger: 'blur' }
          ],
          sort: [
            { required: true, message: '排序字段不能为空', trigger: 'blur' }
          ],
          createName: [
            { required: true, message: '创建人名称不能为空', trigger: 'blur' }
          ],
          createBy: [
            { required: true, message: '创建人ID不能为空', trigger: 'blur' }
          ],
          createTime: [
            { required: true, message: '创建时间不能为空', trigger: 'blur' }
          ],
          updateName: [
            { required: true, message: '更新人名称不能为空', trigger: 'blur' }
          ],
          updateBy: [
            { required: true, message: '更新人ID不能为空', trigger: 'blur' }
          ],
          updateTime: [
            { required: true, message: '更新时间不能为空', trigger: 'blur' }
          ]
        }
      }
    },
    methods: {
      init (id) {
        this.dataForm.id = id || 0
        this.visible = true
        this.$nextTick(() => {
          this.$refs['dataForm'].resetFields()
          if (this.dataForm.id) {
            this.$http({
              url: this.$http.adornUrl(`/activity/activity/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.actypeId = data.activity.actypeId
                this.dataForm.title = data.activity.title
                this.dataForm.acContent = data.activity.acContent
                this.dataForm.acAddress = data.activity.acAddress
                this.dataForm.acAmount = data.activity.acAmount
                this.dataForm.acBudget = data.activity.acBudget
                this.dataForm.timeStart = data.activity.timeStart
                this.dataForm.timeEnd = data.activity.timeEnd
                this.dataForm.showStatus = data.activity.showStatus
                this.dataForm.sort = data.activity.sort
                this.dataForm.createName = data.activity.createName
                this.dataForm.createBy = data.activity.createBy
                this.dataForm.createTime = data.activity.createTime
                this.dataForm.updateName = data.activity.updateName
                this.dataForm.updateBy = data.activity.updateBy
                this.dataForm.updateTime = data.activity.updateTime
              }
            })
          }
        })
      },
      // 表单提交
      dataFormSubmit () {
        this.$refs['dataForm'].validate((valid) => {
          if (valid) {
            this.$http({
              url: this.$http.adornUrl(`/activity/activity/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'actypeId': this.dataForm.actypeId,
                'title': this.dataForm.title,
                'acContent': this.dataForm.acContent,
                'acAddress': this.dataForm.acAddress,
                'acAmount': this.dataForm.acAmount,
                'acBudget': this.dataForm.acBudget,
                'timeStart': this.dataForm.timeStart,
                'timeEnd': this.dataForm.timeEnd,
                'showStatus': this.dataForm.showStatus,
                'sort': this.dataForm.sort,
                'createName': this.dataForm.createName,
                'createBy': this.dataForm.createBy,
                'createTime': this.dataForm.createTime,
                'updateName': this.dataForm.updateName,
                'updateBy': this.dataForm.updateBy,
                'updateTime': this.dataForm.updateTime
              })
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.$message({
                  message: '操作成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.visible = false
                    this.$emit('refreshDataList')
                  }
                })
              } else {
                this.$message.error(data.msg)
              }
            })
          }
        })
      }
    }
  }
</script>
