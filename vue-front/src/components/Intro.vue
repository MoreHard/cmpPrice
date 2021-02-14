<template>
  <div class="intro">
    <h1>검색어를 입력해주세요.</h1>
    <form>
        <input type="text">
        <button>검색</button>
    </form>
  </div>
</template>

<script>
export default {
  name: 'InputKeyword',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
</style>
