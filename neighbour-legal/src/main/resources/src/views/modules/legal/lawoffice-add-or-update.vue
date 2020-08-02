<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="法律事务所名称" prop="officeName">
      <el-input v-model="dataForm.officeName" placeholder="法律事务所名称"></el-input>
    </el-form-item>
    <el-form-item label="法律事务所介绍" prop="officeDesc">
      <el-input v-model="dataForm.officeDesc" placeholder="法律事务所介绍"></el-input>
    </el-form-item>
    <el-form-item label="法律事务所logo" prop="officeLogo">
      <el-input v-model="dataForm.officeLogo" placeholder="法律事务所logo"></el-input>
    </el-form-item>
    <el-form-item label="法律事务所法人" prop="officeRepresentative">
      <el-input v-model="dataForm.officeRepresentative" placeholder="法律事务所法人"></el-input>
    </el-form-item>
    <el-form-item label="律师事务所联系方式" prop="officeContact">
      <el-input v-model="dataForm.officeContact" placeholder="律师事务所联系方式"></el-input>
    </el-form-item>
    <el-form-item label="律师事务所地址" prop="officeAddress">
      <el-input v-model="dataForm.officeAddress" placeholder="律师事务所地址"></el-input>
    </el-form-item>
    <el-form-item label="律师事务所营业执照图片地址" prop="officeBusinessLicense">
      <el-input v-model="dataForm.officeBusinessLicense" placeholder="律师事务所营业执照图片地址"></el-input>
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
          officeName: '',
          officeDesc: '',
          officeLogo: '',
          officeRepresentative: '',
          officeContact: '',
          officeAddress: '',
          officeBusinessLicense: '',
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
          officeName: [
            { required: true, message: '法律事务所名称不能为空', trigger: 'blur' }
          ],
          officeDesc: [
            { required: true, message: '法律事务所介绍不能为空', trigger: 'blur' }
          ],
          officeLogo: [
            { required: true, message: '法律事务所logo不能为空', trigger: 'blur' }
          ],
          officeRepresentative: [
            { required: true, message: '法律事务所法人不能为空', trigger: 'blur' }
          ],
          officeContact: [
            { required: true, message: '律师事务所联系方式不能为空', trigger: 'blur' }
          ],
          officeAddress: [
            { required: true, message: '律师事务所地址不能为空', trigger: 'blur' }
          ],
          officeBusinessLicense: [
            { required: true, message: '律师事务所营业执照图片地址不能为空', trigger: 'blur' }
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
              url: this.$http.adornUrl(`/legal/lawoffice/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.officeName = data.lawOffice.officeName
                this.dataForm.officeDesc = data.lawOffice.officeDesc
                this.dataForm.officeLogo = data.lawOffice.officeLogo
                this.dataForm.officeRepresentative = data.lawOffice.officeRepresentative
                this.dataForm.officeContact = data.lawOffice.officeContact
                this.dataForm.officeAddress = data.lawOffice.officeAddress
                this.dataForm.officeBusinessLicense = data.lawOffice.officeBusinessLicense
                this.dataForm.showStatus = data.lawOffice.showStatus
                this.dataForm.sort = data.lawOffice.sort
                this.dataForm.createName = data.lawOffice.createName
                this.dataForm.createBy = data.lawOffice.createBy
                this.dataForm.createTime = data.lawOffice.createTime
                this.dataForm.updateName = data.lawOffice.updateName
                this.dataForm.updateBy = data.lawOffice.updateBy
                this.dataForm.updateTime = data.lawOffice.updateTime
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
              url: this.$http.adornUrl(`/legal/lawoffice/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'officeName': this.dataForm.officeName,
                'officeDesc': this.dataForm.officeDesc,
                'officeLogo': this.dataForm.officeLogo,
                'officeRepresentative': this.dataForm.officeRepresentative,
                'officeContact': this.dataForm.officeContact,
                'officeAddress': this.dataForm.officeAddress,
                'officeBusinessLicense': this.dataForm.officeBusinessLicense,
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
