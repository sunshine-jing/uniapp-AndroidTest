<template>
	<view class="content">
		<image class="logo" src="/static/logo.png"></image>
		<view>
			<text class="title">{{ title }}</text>
			<view>{{ result }}</view>
			<button type="primary" @click="add">点击测试</button>
			<button type="primary" @click="takePhoto">拍照</button>
			<button type="primary" @click="add2">计算</button>
			<view class="">
				{{result1}}
			</view>
			
		</view>
	</view>
</template>

<script>
const modal = uni.requireNativePlugin('modal');
const dcText = uni.requireNativePlugin('MyTest-Text');
export default {
	data() {
		return {
			title: 'Hello UniApp',
			result: 0,
			result1:0,
		};
	},
	onLoad() {},
	methods: {
		add2(){
			var AddCount = plus.android.importClass('com.hji.test.AddCount');
			var addCount = new AddCount();
			this.result1 = addCount.add(1,2);
		},
		takePhoto() {
			var main = plus.android.runtimeMainActivity();
			var Intent = plus.android.importClass('android.content.Intent');
			var MyActivity = plus.android.importClass('com.hji.test.TakePhotoActivity');
			var intent = new Intent(main, MyActivity.class);
			main.startActivity(intent);
		},
		add() {
			dcText.add({ name: 'test', value: '123' }, result => {
				this.result = result.result;
			});
		}
	}
};
</script>

<style>
.content {
	text-align: center;
	height: 400upx;
}

.logo {
	height: 200upx;
	width: 200upx;
	margin-top: 200upx;
}

.title {
	font-size: 36upx;
	color: #8f8f94;
}

button {
	margin-top: 30upx;
	margin-bottom: 30upx;
}

.button-sp-area {
	margin: 0 auto;
	width: 60%;
}

.content {
	text-align: center;
	height: 400upx;
}

.wrapper {
	flex-direction: column;
	justify-content: center;
}

.button {
	width: 200px;
	margin-top: 30px;
	margin-left: 20px;
	padding-top: 20px;
	padding-bottom: 20px;
	border-width: 2px;
	border-style: solid;
	border-color: #458b00;
	background-color: #458b00;
}

.text {
	font-size: 30px;
	color: #666666;
	text-align: center;
}
</style>
