.class final Lnet/youmi/android/a/a/e/e/d;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/webkit/WebView;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/e/e/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/a/e/e/d;->b:Ljava/lang/String;

    iput-object p3, p0, Lnet/youmi/android/a/a/e/e/d;->c:Landroid/webkit/WebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/e/e/d;->a:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/e/d;->b:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/a/e/b/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/e/e/d;->a:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/a/e/e/d;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lnet/youmi/android/a/a/e/e/d;->a:Landroid/content/Context;

    iget-object v2, p0, Lnet/youmi/android/a/a/e/e/d;->b:Ljava/lang/String;

    const-wide/32 v4, 0x4d3f6400

    invoke-static {v1, v2, v0, v4, v5}, Lnet/youmi/android/a/a/e/b/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)Z

    :cond_0
    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lnet/youmi/android/a/b/b/e;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/a/e/e/d;->c:Landroid/webkit/WebView;

    new-instance v2, Lnet/youmi/android/a/a/i/a/a;

    iget-object v3, p0, Lnet/youmi/android/a/a/e/e/d;->c:Landroid/webkit/WebView;

    invoke-direct {v2, v3, v0}, Lnet/youmi/android/a/a/i/a/a;-><init>(Landroid/webkit/WebView;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
