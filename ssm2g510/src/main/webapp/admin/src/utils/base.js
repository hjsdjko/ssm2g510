const base = {
    get() {
                return {
            url : "http://localhost:8080/ssm2g510/",
            name: "ssm2g510",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm2g510/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "追星小程序"
        } 
    }
}
export default base
