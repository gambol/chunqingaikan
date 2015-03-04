.class public Lnet/youmi/android/a/a/g/e/n;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/e/n;->a:Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/n;->a:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/e/n;->a:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/a/a/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lnet/youmi/android/a/b/c/f;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x3e8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    :try_start_1
    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/n;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v4, "a_app"

    new-instance v0, Lnet/youmi/android/a/c/c/b;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/e/n;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lnet/youmi/android/a/c/c/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lnet/youmi/android/a/c/c/b;->a()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lnet/youmi/android/a/a/g/e/n;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/c/c/a;->f(Landroid/content/Context;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    new-instance v0, Lnet/youmi/android/b/k;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/e/n;->a:Landroid/content/Context;

    invoke-direct/range {v0 .. v5}, Lnet/youmi/android/b/k;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lnet/youmi/android/b/k;->a(I)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_0
    :goto_1
    return-void

    :catch_0
    move-exception v0

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->a(Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method
