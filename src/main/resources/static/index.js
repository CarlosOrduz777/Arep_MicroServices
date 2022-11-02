import axios from 'axios';

function makePost(){
    String tweet = document.getElementById('tweet').value;
    axios.post('/tweet', {
        tweet: tweet
      })
      .then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      });
}
