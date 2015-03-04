.class Lnet/youmi/android/a/a/g/e/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    :goto_0
    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/e/m;->a:Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/m;->a:Landroid/content/Context;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/m;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lnet/youmi/android/a/a/g/e/m;->a:Landroid/content/Context;

    invoke-static {v1, v0}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "c"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v0

    const/16 v1, -0x4b6

    if-eq v0, v1, :cond_2

    const/16 v1, -0x3ea

    if-ne v0, v1, :cond_3

    :cond_2
    const/4 v0, 0x2

    invoke-static {v0}, Lnet/youmi/android/a/a/c;->a(I)V

    :cond_3
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/m;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/e/c;->b(Landroid/content/Context;)V

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/m;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/e/c;->c(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catchall_0
    move-exception v0

    throw v0
.end method
