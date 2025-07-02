document.addEventListener("DOMContentLoaded", function () {
  const warn = new URLSearchParams(window.location.search).get("warn");
  if (warn) {
    alert("⚠ " + warn);
  }

  const success = new URLSearchParams(window.location.search).get("success");
  if (success) {
    alert("✅ " + success);
  }
});
