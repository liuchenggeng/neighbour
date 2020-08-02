<template>
  <el-dialog
    :title="!dataForm.id ? '新增' : '修改'"
    :close-on-click-modal="false"
    :visible.sync="visible">
    <el-form :model="dataForm" :rules="dataRule" ref="dataForm" @keyup.enter.native="dataFormSubmit()" label-width="80px">
    <el-form-item label="省份ID" prop="provinceId">
      <el-input v-model="dataForm.provinceId" placeholder="省份ID"></el-input>
    </el-form-item>
    <el-form-item label="地区ID" prop="cityId">
      <el-input v-model="dataForm.cityId" placeholder="地区ID"></el-input>
    </el-form-item>
    <el-form-item label="县区ID" prop="countyId">
      <el-input v-model="dataForm.countyId" placeholder="县区ID"></el-input>
    </el-form-item>
    <el-form-item label="小区名称" prop="houseName">
      <el-input v-model="dataForm.houseName" placeholder="小区名称"></el-input>
    </el-form-item>
    <el-form-item label="小区开发商" prop="houseBuilder">
      <el-input v-model="dataForm.houseBuilder" placeholder="小区开发商"></el-input>
    </el-form-item>
    <el-form-item label="小区修建时间" prop="houseBuildTime">
      <el-input v-model="dataForm.houseBuildTime" placeholder="小区修建时间"></el-input>
    </el-form-item>
    <el-form-item label="小区简介" prop="houseBrief">
      <el-input v-model="dataForm.houseBrief" placeholder="小区简介"></el-input>
    </el-form-item>
    <el-form-item label="小区详情" prop="houseDetail">
      <el-input v-model="dataForm.houseDetail" placeholder="小区详情"></el-input>
    </el-form-item>
    <el-form-item label="小区价格" prop="housePrice">
      <el-input v-model="dataForm.housePrice" placeholder="小区价格"></el-input>
    </el-form-item>
    <el-form-item label="小区图片预览" prop="houseImgView">
      <el-input v-model="dataForm.houseImgView" placeholder="小区图片预览"></el-input>
    </el-form-item>
    <el-form-item label="物业公司ID" prop="propertyId">
      <el-input v-model="dataForm.propertyId" placeholder="物业公司ID"></el-input>
    </el-form-item>
    <el-form-item label="物业费价格" prop="propertyPrice">
      <el-input v-model="dataForm.propertyPrice" placeholder="物业费价格"></el-input>
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
          provinceId: '',
          cityId: '',
          countyId: '',
          houseName: '',
          houseBuilder: '',
          houseBuildTime: '',
          houseBrief: '',
          houseDetail: '',
          housePrice: '',
          houseImgView: '',
          propertyId: '',
          propertyPrice: '',
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
          provinceId: [
            { required: true, message: '省份ID不能为空', trigger: 'blur' }
          ],
          cityId: [
            { required: true, message: '地区ID不能为空', trigger: 'blur' }
          ],
          countyId: [
            { required: true, message: '县区ID不能为空', trigger: 'blur' }
          ],
          houseName: [
            { required: true, message: '小区名称不能为空', trigger: 'blur' }
          ],
          houseBuilder: [
            { required: true, message: '小区开发商不能为空', trigger: 'blur' }
          ],
          houseBuildTime: [
            { required: true, message: '小区修建时间不能为空', trigger: 'blur' }
          ],
          houseBrief: [
            { required: true, message: '小区简介不能为空', trigger: 'blur' }
          ],
          houseDetail: [
            { required: true, message: '小区详情不能为空', trigger: 'blur' }
          ],
          housePrice: [
            { required: true, message: '小区价格不能为空', trigger: 'blur' }
          ],
          houseImgView: [
            { required: true, message: '小区图片预览不能为空', trigger: 'blur' }
          ],
          propertyId: [
            { required: true, message: '物业公司ID不能为空', trigger: 'blur' }
          ],
          propertyPrice: [
            { required: true, message: '物业费价格不能为空', trigger: 'blur' }
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
              url: this.$http.adornUrl(`/house/house/info/${this.dataForm.id}`),
              method: 'get',
              params: this.$http.adornParams()
            }).then(({data}) => {
              if (data && data.code === 0) {
                this.dataForm.provinceId = data.house.provinceId
                this.dataForm.cityId = data.house.cityId
                this.dataForm.countyId = data.house.countyId
                this.dataForm.houseName = data.house.houseName
                this.dataForm.houseBuilder = data.house.houseBuilder
                this.dataForm.houseBuildTime = data.house.houseBuildTime
                this.dataForm.houseBrief = data.house.houseBrief
                this.dataForm.houseDetail = data.house.houseDetail
                this.dataForm.housePrice = data.house.housePrice
                this.dataForm.houseImgView = data.house.houseImgView
                this.dataForm.propertyId = data.house.propertyId
                this.dataForm.propertyPrice = data.house.propertyPrice
                this.dataForm.showStatus = data.house.showStatus
                this.dataForm.sort = data.house.sort
                this.dataForm.createName = data.house.createName
                this.dataForm.createBy = data.house.createBy
                this.dataForm.createTime = data.house.createTime
                this.dataForm.updateName = data.house.updateName
                this.dataForm.updateBy = data.house.updateBy
                this.dataForm.updateTime = data.house.updateTime
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
              url: this.$http.adornUrl(`/house/house/${!this.dataForm.id ? 'save' : 'update'}`),
              method: 'post',
              data: this.$http.adornData({
                'id': this.dataForm.id || undefined,
                'provinceId': this.dataForm.provinceId,
                'cityId': this.dataForm.cityId,
                'countyId': this.dataForm.countyId,
                'houseName': this.dataForm.houseName,
                'houseBuilder': this.dataForm.houseBuilder,
                'houseBuildTime': this.dataForm.houseBuildTime,
                'houseBrief': this.dataForm.houseBrief,
                'houseDetail': this.dataForm.houseDetail,
                'housePrice': this.dataForm.housePrice,
                'houseImgView': this.dataForm.houseImgView,
                'propertyId': this.dataForm.propertyId,
                'propertyPrice': this.dataForm.propertyPrice,
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
