<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="用户登陆名" prop="username">
      <el-input v-model="dataForm.username" placeholder="用户登陆名"></el-input>
    </el-form-item>
    <el-form-item label="用户密码" prop="password">
      <el-input v-model="dataForm.password" placeholder="用户密码"></el-input>
    </el-form-item>
    <el-form-item label="性别" prop="gender">
      <el-input v-model="dataForm.gender" placeholder="性别"></el-input>
    </el-form-item>
    <el-form-item label="生日" prop="birthday">
      <el-input v-model="dataForm.birthday" placeholder="生日"></el-input>
    </el-form-item>
    <el-form-item label="注册时间" prop="registerTime">
      <el-input v-model="dataForm.registerTime" placeholder="注册时间"></el-input>
    </el-form-item>
    <el-form-item label="上次登陆时间" prop="lastLoginTime">
      <el-input v-model="dataForm.lastLoginTime" placeholder="上次登陆时间"></el-input>
    </el-form-item>
    <el-form-item label="上次登陆IP" prop="lastLoginIp">
      <el-input v-model="dataForm.lastLoginIp" placeholder="上次登陆IP"></el-input>
    </el-form-item>
    <el-form-item label="用户级别ID" prop="userLevelId">
      <el-input v-model="dataForm.userLevelId" placeholder="用户级别ID"></el-input>
    </el-form-item>
    <el-form-item label="昵称" prop="nickname">
      <el-input v-model="dataForm.nickname" placeholder="昵称"></el-input>
    </el-form-item>
    <el-form-item label="移动电话" prop="mobile">
      <el-input v-model="dataForm.mobile" placeholder="移动电话"></el-input>
    </el-form-item>
    <el-form-item label="注册IP" prop="registerIp">
      <el-input v-model="dataForm.registerIp" placeholder="注册IP"></el-input>
    </el-form-item>
    <el-form-item label="头像" prop="avatar">
      <el-input v-model="dataForm.avatar" placeholder="头像"></el-input>
    </el-form-item>
    <el-form-item label="微信OpenID" prop="weixinOpenid">
      <el-input v-model="dataForm.weixinOpenid" placeholder="微信OpenID"></el-input>
    </el-form-item>
    <el-form-item label="微信UnionID" prop="weixinUnionId">
      <el-input v-model="dataForm.weixinUnionId" placeholder="微信UnionID"></el-input>
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
          username: '',
          password: '',
          gender: '',
          birthday: '',
          registerTime: '',
          lastLoginTime: '',
          lastLoginIp: '',
          userLevelId: '',
          nickname: '',
          mobile: '',
          registerIp: '',
          avatar: '',
          weixinOpenid: '',
          weixinUnionId: '',
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
          username: [
            { required: true, message: '用户登陆名不能为空', trigger: 'blur' }
          ],
          password: [
            { required: true, message: '用户密码不能为空', trigger: 'blur' }
          ],
          gender: [
            { required: true, message: '性别不能为空', trigger: 'blur' }
          ],
          birthday: [
            { required: true, message: '生日不能为空', trigger: 'blur' }
          ],
          registerTime: [
            { required: true, message: '注册时间不能为空', trigger: 'blur' }
          ],
          lastLoginTime: [
            { required: true, message: '上次登陆时间不能为空', trigger: 'blur' }
          ],
          lastLoginIp: [
            { required: true, message: '上次登陆IP不能为空', trigger: 'blur' }
          ],
          userLevelId: [
            { required: true, message: '用户级别ID不能为空', trigger: 'blur' }
          ],
          nickname: [
            { required: true, message: '昵称不能为空', trigger: 'blur' }
          ],
          mobile: [
            { required: true, message: '移动电话不能为空', trigger: 'blur' }
          ],
          registerIp: [
            { required: true, message: '注册IP不能为空', trigger: 'blur' }
          ],
          avatar: [
            { required: true, message: '头像不能为空', trigger: 'blur' }
          ],
          weixinOpenid: [
            { required: true, message: '微信OpenID不能为空', trigger: 'blur' }
          ],
          weixinUnionId: [
            { required: true, message: '微信UnionID不能为空', trigger: 'blur' }
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
              url: this.$http.adornUrl(`/member/userbaseinfo/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.username = data.userBaseInfo.username
                this.dataForm.password = data.userBaseInfo.password
                this.dataForm.gender = data.userBaseInfo.gender
                this.dataForm.birthday = data.userBaseInfo.birthday
                this.dataForm.registerTime = data.userBaseInfo.registerTime
                this.dataForm.lastLoginTime = data.userBaseInfo.lastLoginTime
                this.dataForm.lastLoginIp = data.userBaseInfo.lastLoginIp
                this.dataForm.userLevelId = data.userBaseInfo.userLevelId
                this.dataForm.nickname = data.userBaseInfo.nickname
                this.dataForm.mobile = data.userBaseInfo.mobile
                this.dataForm.registerIp = data.userBaseInfo.registerIp
                this.dataForm.avatar = data.userBaseInfo.avatar
                this.dataForm.weixinOpenid = data.userBaseInfo.weixinOpenid
                this.dataForm.weixinUnionId = data.userBaseInfo.weixinUnionId
                this.dataForm.showStatus = data.userBaseInfo.showStatus
                this.dataForm.sort = data.userBaseInfo.sort
                this.dataForm.createName = data.userBaseInfo.createName
                this.dataForm.createBy = data.userBaseInfo.createBy
                this.dataForm.createTime = data.userBaseInfo.createTime
                this.dataForm.updateName = data.userBaseInfo.updateName
                this.dataForm.updateBy = data.userBaseInfo.updateBy
                this.dataForm.updateTime = data.userBaseInfo.updateTime
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
              url: this.$http.adornUrl(`/member/userbaseinfo/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'username': this.dataForm.username,
                'password': this.dataForm.password,
                'gender': this.dataForm.gender,
                'birthday': this.dataForm.birthday,
                'registerTime': this.dataForm.registerTime,
                'lastLoginTime': this.dataForm.lastLoginTime,
                'lastLoginIp': this.dataForm.lastLoginIp,
                'userLevelId': this.dataForm.userLevelId,
                'nickname': this.dataForm.nickname,
                'mobile': this.dataForm.mobile,
                'registerIp': this.dataForm.registerIp,
                'avatar': this.dataForm.avatar,
                'weixinOpenid': this.dataForm.weixinOpenid,
                'weixinUnionId': this.dataForm.weixinUnionId,
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
