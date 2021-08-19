export default function InboxPage(reply, newReply) {
  return `
  <div class='myInbox'>
  ${reply
    .map((replies) => {
      return `
      <h1 class="myId">Healthy Response</h1>
      <div class="inbox">
      <p class="subject">${replies.subject}</p>
      <p class="title">${replies.title}</p> 
      <p class="content">${replies.content}</p>
      </div>
      `
      ;
    }) 
    .join()}
  
  </div>
    `;
}

