<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="律师事务所ID" prop="officeId">
      <el-input v-model="dataForm.officeId" placeholder="律师事务所ID"></el-input>
    </el-form-item>
    <el-form-item label="法律咨询编号" prop="lagelSn">
      <el-input v-model="dataForm.lagelSn" placeholder="法律咨询编号"></el-input>
    </el-form-item>
    <el-form-item label="标题" prop="title">
      <el-input v-model="dataForm.title" placeholder="标题"></el-input>
    </el-form-item>
    <el-form-item label="详情内容" prop="content">
      <el-input v-model="dataForm.content" placeholder="详情内容"></el-input>
    </el-form-item>
    <el-form-item label="咨询人ID=用户信息表ID" prop="userId">
      <el-input v-model="dataForm.userId" placeholder="咨询人ID=用户信息表ID"></el-input>
    </el-form-item>
    <el-form-item label="咨询人名字" prop="consulterName">
      <el-input v-model="dataForm.consulterName" placeholder="咨询人名字"></el-input>
    </el-form-item>
    <el-form-item label="咨询人联系方式" prop="consulterContact">
      <el-input v-model="dataForm.consulterContact" placeholder="咨询人联系方式"></el-input>
    </el-form-item>
    <el-form-item label="咨询人地址" prop="consulterAddress">
      <el-input v-model="dataForm.consulterAddress" placeholder="咨询人地址"></el-input>
    </el-form-item>
    <el-form-item label="咨询状态0=未应答,1=已应答,2=已关闭" prop="status">
      <el-input v-model="dataForm.status" placeholder="咨询状态0=未应答,1=已应答,2=已关闭"></el-input>
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
          officeId: '',
          lagelSn: '',
          title: '',
          content: '',
          userId: '',
          consulterName: '',
          consulterContact: '',
          consulterAddress: '',
          status: '',
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
          officeId: [
            { required: true, message: '律师事务所ID不能为空', trigger: 'blur' }
          ],
          lagelSn: [
            { required: true, message: '法律咨询编号不能为空', trigger: 'blur' }
          ],
          title: [
            { required: true, message: '标题不能为空', trigger: 'blur' }
          ],
          content: [
            { required: true, message: '详情内容不能为空', trigger: 'blur' }
          ],
          userId: [
            { required: true, message: '咨询人ID=用户信息表ID不能为空', trigger: 'blur' }
          ],
          consulterName: [
            { required: true, message: '咨询人名字不能为空', trigger: 'blur' }
          ],
          consulterContact: [
            { required: true, message: '咨询人联系方式不能为空', trigger: 'blur' }
          ],
          consulterAddress: [
            { required: true, message: '咨询人地址不能为空', trigger: 'blur' }
          ],
          status: [
            { required: true, message: '咨询状态0=未应答,1=已应答,2=已关闭不能为空', trigger: 'blur' }
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
              url: this.$http.adornUrl(`/legal/legalconsulte/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.officeId = data.legalConsulte.officeId
                this.dataForm.lagelSn = data.legalConsulte.lagelSn
                this.dataForm.title = data.legalConsulte.title
                this.dataForm.content = data.legalConsulte.content
                this.dataForm.userId = data.legalConsulte.userId
                this.dataForm.consulterName = data.legalConsulte.consulterName
                this.dataForm.consulterContact = data.legalConsulte.consulterContact
                this.dataForm.consulterAddress = data.legalConsulte.consulterAddress
                this.dataForm.status = data.legalConsulte.status
                this.dataForm.showStatus = data.legalConsulte.showStatus
                this.dataForm.sort = data.legalConsulte.sort
                this.dataForm.createName = data.legalConsulte.createName
                this.dataForm.createBy = data.legalConsulte.createBy
                this.dataForm.createTime = data.legalConsulte.createTime
                this.dataForm.updateName = data.legalConsulte.updateName
                this.dataForm.updateBy = data.legalConsulte.updateBy
                this.dataForm.updateTime = data.legalConsulte.updateTime
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
              url: this.$http.adornUrl(`/legal/legalconsulte/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'officeId': this.dataForm.officeId,
                'lagelSn': this.dataForm.lagelSn,
                'title': this.dataForm.title,
                'content': this.dataForm.content,
                'userId': this.dataForm.userId,
                'consulterName': this.dataForm.consulterName,
                'consulterContact': this.dataForm.consulterContact,
                'consulterAddress': this.dataForm.consulterAddress,
                'status': this.dataForm.status,
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
