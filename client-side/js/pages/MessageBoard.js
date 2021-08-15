export default function MessageBoard(messages) {
  return `
    <div class="messageBoard">
    ${messages
      .map((post) => {
        return `
        <div class="messageBoardTable">
        <p class="subject">${post.subject}</p>
        <p class="title">${post.title}</p>
        <p class="post">${post.content}</p>
        <div class="reply">
        <input type="text" class="replyTitlet" placeholder="Reply Title">
        <input type="text" class="replySubject" placeholder="Reply Subject">
        <input type="text" class="replyContent" placeholder="Reply Content">
        <button class="replyButton"></button>
        </div>
       
        `;
      })
      .join("")}
    </div> 
    </div>   
    `;
}
