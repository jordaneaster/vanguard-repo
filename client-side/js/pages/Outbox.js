export default function Outbox() {
  return `
    <h1>Send A Message</h1>
    <div class="outbox">
    <input type='text' id='subject' placeholder="Subject">
    <input type='text' id='title' placeholder="Title ">
    <input type='text' id='content' placeholder="Type Content...">
    <button class="sendMessage">Send</button>
    <input type="hidden" class="toOutbox">
    </div>
    `;
}
