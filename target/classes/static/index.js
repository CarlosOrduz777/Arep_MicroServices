function makePost(){
    var tweet = document.getElementById('tweet').value;
    console.log(tweet);
    axios.post('http://localhost:4567/tweet', {
        tweet: tweet,
      })
      .then(function (response) {
        console.log(response);
        getTweets();
      })
      .catch(function (error) {
        console.log(error);
      });
}

function getTweets(){
    axios.get("/stream")
        .then(response => {
            // Obtenemos los datos
            document.getElementById("getTweets").innerHTML = JSON.stringify(response.data);
        })
        .catch(e => {
            alert("An error ocurred");
        })
}
