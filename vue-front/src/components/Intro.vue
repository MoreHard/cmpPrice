<template>
  <div class="intro">
    <h1>검색어를 입력해주세요.</h1>
    <form>
        <input type="text" v-model = "input_msg" autofocus >
        <button type="button" @click="getData">검색</button>
    </form>

    <select class = "form-control" v-model="filter" @change = "changeFilter">>
      <option :key="i" :value="d.v" v-for="(d,i) in options">{{d.t}}</option>
    </select>

    <table class = "table table-bordered">
      <tr :key="i" :value="d.v" v-for="(d,i) in options">
        <td>{{d.v }}</td>
        <td>{{d.t}}</td>
      </tr>
    </table>

  </div>
</template>

<script>
export default {
  name: 'InputKeyword',
  props: {
    msg: String
  },
  
  /* watch : 해당 데이터가 변경될 떄마다 캐치 가능*/
  watch:{ 
    input_msg(){
      console.log(this.input_msg);
    },
    
  }
  ,
  data(){
    return{
      input_msg: "",
      filter : "",
      options: [ 
        {v:"New", t:"최신순"},
        {v:"Expensive", t:"높은 가격순"},
        {v:"Inexpensive", t:"낮은 가격순"}
      ]
    };
  },
  methods: {
    getData(){
      alert(this.input_msg)
    },
    setData(){
      this.input_msg = ""
    },
    changeFilter(){
        alert(this.filter);
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
</style>
