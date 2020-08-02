<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="实名认证后的真实用户名" prop="realName">
      <el-input v-model="dataForm.realName" placeholder="实名认证后的真实用户名"></el-input>
    </el-form-item>
    <el-form-item label="用户手机" prop="mobile">
      <el-input v-model="dataForm.mobile" placeholder="用户手机"></el-input>
    </el-form-item>
    <el-form-item label="手机验证码" prop="mobileCode">
      <el-input v-model="dataForm.mobileCode" placeholder="手机验证码"></el-input>
    </el-form-item>
    <el-form-item label="小区ID号" prop="houseId">
      <el-input v-model="dataForm.houseId" placeholder="小区ID号"></el-input>
    </el-form-item>
    <el-form-item label="当前实名认证的状态" prop="status">
      <el-input v-model="dataForm.status" placeholder="当前实名认证的状态"></el-input>
    </el-form-item>
    <el-form-item label="认证类型[0=身份证1=护照]" prop="type">
      <el-input v-model="dataForm.type" placeholder="认证类型[0=身份证1=护照]"></el-input>
    </el-form-item>
    <el-form-item label="用户头像地址" prop="imgUrl">
      <el-input v-model="dataForm.imgUrl" placeholder="用户头像地址"></el-input>
    </el-form-item>
    <el-form-item label="楼栋" prop="housingNum">
      <el-input v-model="dataForm.housingNum" placeholder="楼栋"></el-input>
    </el-form-item>
    <el-form-item label="门牌号" prop="pepNum">
      <el-input v-model="dataForm.pepNum" placeholder="门牌号"></el-input>
    </el-form-item>
    <el-form-item label="身份证号" prop="idCard">
      <el-input v-model="dataForm.idCard" placeholder="身份证号"></el-input>
    </el-form-item>
    <el-form-item label="身份证门牌号" prop="idAddresss">
      <el-input v-model="dataForm.idAddresss" placeholder="身份证门牌号"></el-input>
    </el-form-item>
    <el-form-item label="身份证正面照片地址" prop="idCardImgA">
      <el-input v-model="dataForm.idCardImgA" placeholder="身份证正面照片地址"></el-input>
    </el-form-item>
    <el-form-item label="反面照片地址" prop="idCardImgB">
      <el-input v-model="dataForm.idCardImgB" placeholder="反面照片地址"></el-input>
    </el-form-item>
    <el-form-item label="护照号" prop="passportNum">
      <el-input v-model="dataForm.passportNum" placeholder="护照号"></el-input>
    </el-form-item>
    <el-form-item label="护照信息页" prop="passportImg">
      <el-input v-model="dataForm.passportImg" placeholder="护照信息页"></el-input>
    </el-form-item>
    <el-form-item label="用户类型0=普通用户,1=系统用户" prop="userType">
      <el-input v-model="dataForm.userType" placeholder="用户类型0=普通用户,1=系统用户"></el-input>
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
          realName: '',
          mobile: '',
          mobileCode: '',
          houseId: '',
          status: '',
          type: '',
          imgUrl: '',
          housingNum: '',
          pepNum: '',
          idCard: '',
          idAddresss: '',
          idCardImgA: '',
          idCardImgB: '',
          passportNum: '',
          passportImg: '',
          userType: '',
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
          realName: [
            { required: true, message: '实名认证后的真实用户名不能为空', trigger: 'blur' }
          ],
          mobile: [
            { required: true, message: '用户手机不能为空', trigger: 'blur' }
          ],
          mobileCode: [
            { required: true, message: '手机验证码不能为空', trigger: 'blur' }
          ],
          houseId: [
            { required: true, message: '小区ID号不能为空', trigger: 'blur' }
          ],
          status: [
            { required: true, message: '当前实名认证的状态不能为空', trigger: 'blur' }
          ],
          type: [
            { required: true, message: '认证类型[0=身份证1=护照]不能为空', trigger: 'blur' }
          ],
          imgUrl: [
            { required: true, message: '用户头像地址不能为空', trigger: 'blur' }
          ],
          housingNum: [
            { required: true, message: '楼栋不能为空', trigger: 'blur' }
          ],
          pepNum: [
            { required: true, message: '门牌号不能为空', trigger: 'blur' }
          ],
          idCard: [
            { required: true, message: '身份证号不能为空', trigger: 'blur' }
          ],
          idAddresss: [
            { required: true, message: '身份证门牌号不能为空', trigger: 'blur' }
          ],
          idCardImgA: [
            { required: true, message: '身份证正面照片地址不能为空', trigger: 'blur' }
          ],
          idCardImgB: [
            { required: true, message: '反面照片地址不能为空', trigger: 'blur' }
          ],
          passportNum: [
            { required: true, message: '护照号不能为空', trigger: 'blur' }
          ],
          passportImg: [
            { required: true, message: '护照信息页不能为空', trigger: 'blur' }
          ],
          userType: [
            { required: true, message: '用户类型0=普通用户,1=系统用户不能为空', trigger: 'blur' }
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
              url: this.$http.adornUrl(`/member/userdetailinfo/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.realName = data.userDetailInfo.realName
                this.dataForm.mobile = data.userDetailInfo.mobile
                this.dataForm.mobileCode = data.userDetailInfo.mobileCode
                this.dataForm.houseId = data.userDetailInfo.houseId
                this.dataForm.status = data.userDetailInfo.status
                this.dataForm.type = data.userDetailInfo.type
                this.dataForm.imgUrl = data.userDetailInfo.imgUrl
                this.dataForm.housingNum = data.userDetailInfo.housingNum
                this.dataForm.pepNum = data.userDetailInfo.pepNum
                this.dataForm.idCard = data.userDetailInfo.idCard
                this.dataForm.idAddresss = data.userDetailInfo.idAddresss
                this.dataForm.idCardImgA = data.userDetailInfo.idCardImgA
                this.dataForm.idCardImgB = data.userDetailInfo.idCardImgB
                this.dataForm.passportNum = data.userDetailInfo.passportNum
                this.dataForm.passportImg = data.userDetailInfo.passportImg
                this.dataForm.userType = data.userDetailInfo.userType
                this.dataForm.showStatus = data.userDetailInfo.showStatus
                this.dataForm.sort = data.userDetailInfo.sort
                this.dataForm.createName = data.userDetailInfo.createName
                this.dataForm.createBy = data.userDetailInfo.createBy
                this.dataForm.createTime = data.userDetailInfo.createTime
                this.dataForm.updateName = data.userDetailInfo.updateName
                this.dataForm.updateBy = data.userDetailInfo.updateBy
                this.dataForm.updateTime = data.userDetailInfo.updateTime
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
              url: this.$http.adornUrl(`/member/userdetailinfo/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'realName': this.dataForm.realName,
                'mobile': this.dataForm.mobile,
                'mobileCode': this.dataForm.mobileCode,
                'houseId': this.dataForm.houseId,
                'status': this.dataForm.status,
                'type': this.dataForm.type,
                'imgUrl': this.dataForm.imgUrl,
                'housingNum': this.dataForm.housingNum,
                'pepNum': this.dataForm.pepNum,
                'idCard': this.dataForm.idCard,
                'idAddresss': this.dataForm.idAddresss,
                'idCardImgA': this.dataForm.idCardImgA,
                'idCardImgB': this.dataForm.idCardImgB,
                'passportNum': this.dataForm.passportNum,
                'passportImg': this.dataForm.passportImg,
                'userType': this.dataForm.userType,
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
