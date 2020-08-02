<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="用户ID" prop="userId">
      <el-input v-model="dataForm.userId" placeholder="用户ID"></el-input>
    </el-form-item>
    <el-form-item label="收货人姓名" prop="userName">
      <el-input v-model="dataForm.userName" placeholder="收货人姓名"></el-input>
    </el-form-item>
    <el-form-item label="手机" prop="telNumber">
      <el-input v-model="dataForm.telNumber" placeholder="手机"></el-input>
    </el-form-item>
    <el-form-item label="邮编" prop="postalCode">
      <el-input v-model="dataForm.postalCode" placeholder="邮编"></el-input>
    </el-form-item>
    <el-form-item label="收货地址国家码" prop="nationalCode">
      <el-input v-model="dataForm.nationalCode" placeholder="收货地址国家码"></el-input>
    </el-form-item>
    <el-form-item label="省" prop="provinceName">
      <el-input v-model="dataForm.provinceName" placeholder="省"></el-input>
    </el-form-item>
    <el-form-item label="市" prop="cityName">
      <el-input v-model="dataForm.cityName" placeholder="市"></el-input>
    </el-form-item>
    <el-form-item label="区" prop="countyName">
      <el-input v-model="dataForm.countyName" placeholder="区"></el-input>
    </el-form-item>
    <el-form-item label="详细收货地址信息" prop="detailInfo">
      <el-input v-model="dataForm.detailInfo" placeholder="详细收货地址信息"></el-input>
    </el-form-item>
    <el-form-item label="" prop="isDefault">
      <el-input v-model="dataForm.isDefault" placeholder=""></el-input>
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
          userId: '',
          userName: '',
          telNumber: '',
          postalCode: '',
          nationalCode: '',
          provinceName: '',
          cityName: '',
          countyName: '',
          detailInfo: '',
          isDefault: '',
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
          userId: [
            { required: true, message: '用户ID不能为空', trigger: 'blur' }
          ],
          userName: [
            { required: true, message: '收货人姓名不能为空', trigger: 'blur' }
          ],
          telNumber: [
            { required: true, message: '手机不能为空', trigger: 'blur' }
          ],
          postalCode: [
            { required: true, message: '邮编不能为空', trigger: 'blur' }
          ],
          nationalCode: [
            { required: true, message: '收货地址国家码不能为空', trigger: 'blur' }
          ],
          provinceName: [
            { required: true, message: '省不能为空', trigger: 'blur' }
          ],
          cityName: [
            { required: true, message: '市不能为空', trigger: 'blur' }
          ],
          countyName: [
            { required: true, message: '区不能为空', trigger: 'blur' }
          ],
          detailInfo: [
            { required: true, message: '详细收货地址信息不能为空', trigger: 'blur' }
          ],
          isDefault: [
            { required: true, message: '不能为空', trigger: 'blur' }
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
              url: this.$http.adornUrl(`/member/receiveaddress/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.userId = data.receiveAddress.userId
                this.dataForm.userName = data.receiveAddress.userName
                this.dataForm.telNumber = data.receiveAddress.telNumber
                this.dataForm.postalCode = data.receiveAddress.postalCode
                this.dataForm.nationalCode = data.receiveAddress.nationalCode
                this.dataForm.provinceName = data.receiveAddress.provinceName
                this.dataForm.cityName = data.receiveAddress.cityName
                this.dataForm.countyName = data.receiveAddress.countyName
                this.dataForm.detailInfo = data.receiveAddress.detailInfo
                this.dataForm.isDefault = data.receiveAddress.isDefault
                this.dataForm.showStatus = data.receiveAddress.showStatus
                this.dataForm.sort = data.receiveAddress.sort
                this.dataForm.createName = data.receiveAddress.createName
                this.dataForm.createBy = data.receiveAddress.createBy
                this.dataForm.createTime = data.receiveAddress.createTime
                this.dataForm.updateName = data.receiveAddress.updateName
                this.dataForm.updateBy = data.receiveAddress.updateBy
                this.dataForm.updateTime = data.receiveAddress.updateTime
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
              url: this.$http.adornUrl(`/member/receiveaddress/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'userId': this.dataForm.userId,
                'userName': this.dataForm.userName,
                'telNumber': this.dataForm.telNumber,
                'postalCode': this.dataForm.postalCode,
                'nationalCode': this.dataForm.nationalCode,
                'provinceName': this.dataForm.provinceName,
                'cityName': this.dataForm.cityName,
                'countyName': this.dataForm.countyName,
                'detailInfo': this.dataForm.detailInfo,
                'isDefault': this.dataForm.isDefault,
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
