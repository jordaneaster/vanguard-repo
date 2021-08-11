export default function MessageBoard(messages) {
  return `
    <div class="messageBoard">
    ${messages
      .map((post) => {
        return `
        <div class="messageBoardTable">
        <p class="subject">${post.subject}</p>
        <p class="subject">${post.title}</p>
        <p class="subject">${post.content}</p>
        </div>
        <div class="reply">
        <input type="text" class="replyContent" placeholder="Enter Reply">
        <button class="replyButton">Send</button>
        </div>
        `;
      })
      .join("")}
    </div>
    `;
}
