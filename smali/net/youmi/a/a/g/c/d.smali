.class Lnet/youmi/android/a/a/g/c/d;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/a/b/g/d/a;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lnet/youmi/android/a/a/g/c/a;

.field private c:Ljava/util/HashMap;


# direct methods
.method constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/a/g/c/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/a/g/c/d;->c:Ljava/util/HashMap;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/a/g/c/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/a/a/g/c/d;->b:Lnet/youmi/android/a/a/g/c/a;

    return-void
.end method

.method public static a(Landroid/content/Context;ILjava/lang/String;)V
    .locals 8

    :try_start_0
    const-string v0, "notification"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    invoke-static {p0, p2}, Lnet/youmi/android/a/b/k/h;->a(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    const/high16 v2, 0x8000000

    invoke-static {p0, p1, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->s()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    :try_start_1
    invoke-static {p0, p2}, Lnet/youmi/android/a/b/k/j;->b(Landroid/content/Context;Ljava/lang/String;)Lnet/youmi/android/a/b/k/a;

    move-result-object v2

    invoke-virtual {v2}, Lnet/youmi/android/a/b/k/a;->a()Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v1

    :goto_0
    const v2, 0x1080074

    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, Lnet/youmi/android/a/b/k/j;->b(Landroid/content/Context;Ljava/lang/String;)Lnet/youmi/android/a/b/k/a;

    move-result-object v4

    invoke-virtual {v4}, Lnet/youmi/android/a/b/k/a;->c()I
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    move-result v2

    :goto_1
    :try_start_3
    new-instance v4, Landroid/app/Notification;

    invoke-direct {v4}, Landroid/app/Notification;-><init>()V

    const/16 v5, 0x10

    iput v5, v4, Landroid/app/Notification;->flags:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    iput-wide v6, v4, Landroid/app/Notification;->when:J

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->r()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v4, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    iput v2, v4, Landroid/app/Notification;->icon:I

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, p0, v1, v2, v3}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v0, p1, v4}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    :goto_2
    return-void

    :catch_0
    move-exception v0

    goto :goto_2

    :catch_1
    move-exception v4

    goto :goto_1

    :catch_2
    move-exception v2

    goto :goto_0
.end method

.method public static f(Lnet/youmi/android/a/b/g/e/a;)I
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/e/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/g/c/c;
    .locals 6

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/d;->b:Lnet/youmi/android/a/a/g/c/a;

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->c()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    move-object v0, v1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/d;->b:Lnet/youmi/android/a/a/g/c/a;

    invoke-virtual {v0, p1}, Lnet/youmi/android/a/a/g/c/a;->f_(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/e/g/a;

    move-result-object v3

    if-nez v3, :cond_3

    move-object v0, v1

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/d;->c:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/d;->c:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/g/c/c;

    goto :goto_0

    :cond_4
    new-instance v0, Lnet/youmi/android/a/a/g/c/c;

    iget-object v4, p0, Lnet/youmi/android/a/a/g/c/d;->a:Landroid/content/Context;

    invoke-static {p1}, Lnet/youmi/android/a/a/g/c/d;->f(Lnet/youmi/android/a/b/g/e/a;)I

    move-result v5

    invoke-direct {v0, v4, v3, v5}, Lnet/youmi/android/a/a/g/c/c;-><init>(Landroid/content/Context;Lnet/youmi/android/a/a/e/g/a;I)V

    iget-object v3, p0, Lnet/youmi/android/a/a/g/c/d;->c:Ljava/util/HashMap;

    invoke-virtual {v3, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method public a(I)V
    .locals 0

    return-void
.end method

.method public a(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    return-void
.end method

.method public a(Lnet/youmi/android/a/b/g/e/a;JJIJ)V
    .locals 1

    :try_start_0
    invoke-static {}, Lnet/youmi/android/AdManager;->isDownloadTipsDisplayOnNotification()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/g/c/d;->g(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/g/c/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p6, p7, p8}, Lnet/youmi/android/a/a/g/c/c;->a(IJ)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 1

    :try_start_0
    invoke-static {}, Lnet/youmi/android/AdManager;->isDownloadTipsDisplayOnNotification()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/g/c/d;->g(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/g/c/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/c/c;->a()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public c(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 2

    :try_start_0
    invoke-static {}, Lnet/youmi/android/AdManager;->isDownloadTipsDisplayOnNotification()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/g/c/d;->g(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/g/c/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/g/c/c;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public d(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 6

    :try_start_0
    invoke-static {}, Lnet/youmi/android/AdManager;->isDownloadTipsDisplayOnNotification()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, p1}, Lnet/youmi/android/a/a/g/c/d;->g(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/a/g/c/c;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/d;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/b/i/k;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->e()J

    move-result-wide v0

    const-wide/16 v4, 0x0

    cmp-long v3, v0, v4

    if-gtz v3, :cond_2

    const-wide/32 v0, 0xa00000

    :cond_2
    iget-object v3, p0, Lnet/youmi/android/a/a/g/c/d;->a:Landroid/content/Context;

    invoke-static {v3, v0, v1}, Lnet/youmi/android/a/b/k/n;->a(Landroid/content/Context;J)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lnet/youmi/android/a/a/g/c/c;->a(Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_3
    invoke-static {}, Lnet/youmi/android/a/a/h/a;->m()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lnet/youmi/android/a/a/g/c/c;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    invoke-static {}, Lnet/youmi/android/a/a/h/a;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lnet/youmi/android/a/a/g/c/c;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0
.end method

.method public e(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    return-void
.end method
