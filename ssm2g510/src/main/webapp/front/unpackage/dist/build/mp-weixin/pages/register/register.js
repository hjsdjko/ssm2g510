(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/register/register"],{"0b8f":function(e,t,n){},"2ff6":function(e,t,n){"use strict";n.r(t);var r=n("cc37"),a=n("8a88");for(var u in a)"default"!==u&&function(e){n.d(t,e,(function(){return a[e]}))}(u);n("8b3c");var i,o=n("f0c5"),c=Object(o["a"])(a["default"],r["b"],r["c"],!1,null,"02539082",null,!1,r["a"],i);t["default"]=c.exports},"8a88":function(e,t,n){"use strict";n.r(t);var r=n("bd03"),a=n.n(r);for(var u in r)"default"!==u&&function(e){n.d(t,e,(function(){return r[e]}))}(u);t["default"]=a.a},"8b3c":function(e,t,n){"use strict";var r=n("0b8f"),a=n.n(r);a.a},bd03:function(e,t,n){"use strict";(function(e){Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var r=a(n("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function u(e,t,n,r,a,u,i){try{var o=e[u](i),c=o.value}catch(l){return void n(l)}o.done?t(c):Promise.resolve(c).then(r,a)}function i(e){return function(){var t=this,n=arguments;return new Promise((function(r,a){var i=e.apply(t,n);function o(e){u(i,r,a,o,c,"next",e)}function c(e){u(i,r,a,o,c,"throw",e)}o(void 0)}))}}var o={data:function(){return{ruleForm:{},tableName:""}},onLoad:function(){var t=e.getStorageSync("loginTable");this.tableName=t,this.styleChange()},methods:{styleChange:function(){this.$nextTick((function(){}))},getUUID:function(){return(new Date).getTime()},register:function(){var e=this;return i(r.default.mark((function t(){return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:if(e.ruleForm.yonghuzhanghao||"yonghu"!=e.tableName){t.next=3;break}return e.$utils.msg("用户账号不能为空"),t.abrupt("return");case 3:if(e.ruleForm.yonghuxingming||"yonghu"!=e.tableName){t.next=6;break}return e.$utils.msg("用户姓名不能为空"),t.abrupt("return");case 6:if(e.ruleForm.mima||"yonghu"!=e.tableName){t.next=9;break}return e.$utils.msg("密码不能为空"),t.abrupt("return");case 9:if("yonghu"!=e.tableName||!e.ruleForm.lianxidianhua||e.$validate.isMobile(e.ruleForm.lianxidianhua)){t.next=12;break}return e.$utils.msg("联系电话应输入手机格式"),t.abrupt("return");case 12:if("yonghu"!=e.tableName||!e.ruleForm.dianziyouxiang||e.$validate.isEmail(e.ruleForm.dianziyouxiang)){t.next=15;break}return e.$utils.msg("电子邮箱应输入邮件格式"),t.abrupt("return");case 15:return t.next=17,e.$api.register("".concat(e.tableName),e.ruleForm);case 17:e.$utils.msgBack("注册成功");case 19:case"end":return t.stop()}}),t)})))()}}};t.default=o}).call(this,n("543d")["default"])},cc37:function(e,t,n){"use strict";var r;n.d(t,"b",(function(){return a})),n.d(t,"c",(function(){return u})),n.d(t,"a",(function(){return r}));var a=function(){var e=this,t=e.$createElement;e._self._c},u=[]},d7a3:function(e,t,n){"use strict";(function(e){n("d190");r(n("66fd"));var t=r(n("2ff6"));function r(e){return e&&e.__esModule?e:{default:e}}e(t.default)}).call(this,n("543d")["createPage"])}},[["d7a3","common/runtime","common/vendor"]]]);