.class public Lnet/youmi/android/ExpService;
.super Landroid/app/IntentService;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "e298a29c3e4ed1313f3a82588d004ffd"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected final onHandleIntent(Landroid/content/Intent;)V
    .locals 5

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/ExpService;->getApplication()Landroid/app/Application;

    move-result-object v1

    sget-object v0, Lnet/youmi/android/a/a/g/a/g;->a:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lnet/youmi/android/a/a/g/a/c;

    invoke-direct {v0, v1}, Lnet/youmi/android/a/a/g/a/c;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/c;->a()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_2
    sget-object v0, Lnet/youmi/android/a/a/g/a/g;->b:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v1}, Lnet/youmi/android/a/a/g/a/a/c;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/a/c;->c()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_3

    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v3

    new-instance v4, Lnet/youmi/android/c;

    invoke-direct {v4, p0, v1, v2}, Lnet/youmi/android/c;-><init>(Lnet/youmi/android/ExpService;Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v3, v4}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z

    :cond_3
    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/a/c;->b()V

    invoke-static {v1}, Lnet/youmi/android/a/a/g/a/g;->a(Landroid/content/Context;)V

    goto :goto_0

    :cond_4
    sget-object v0, Lnet/youmi/android/a/a/g/a/g;->c:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "AdData"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    instance-of v2, v0, Lnet/youmi/android/a/a/g/a/b/b;

    if-eqz v2, :cond_0

    check-cast v0, Lnet/youmi/android/a/a/g/a/b/b;

    new-instance v2, Lnet/youmi/android/a/a/g/a/b;

    invoke-direct {v2, v1, v0}, Lnet/youmi/android/a/a/g/a/b;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/g/a/b/b;)V

    invoke-virtual {v2}, Lnet/youmi/android/a/a/g/a/b;->a()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method
