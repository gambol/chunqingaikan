.class public Lnet/youmi/android/offers/d/b/f;
.super Ljava/lang/Object;


# direct methods
.method public static a(Landroid/content/Context;Lnet/youmi/android/offers/EarnPointsOrderInfo;)V
    .locals 4

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, Lnet/youmi/android/offers/PointsManager;->isEnableEarnPointsToastTips()Z

    move-result v1

    if-eqz v1, :cond_2

    if-nez v0, :cond_5

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lnet/youmi/android/a/b/k/j;->b(Landroid/content/Context;Ljava/lang/String;)Lnet/youmi/android/a/b/k/a;

    move-result-object v1

    :goto_1
    invoke-static {p0}, Lnet/youmi/android/a/b/k/o;->f(Landroid/content/Context;)Landroid/app/ActivityManager;

    move-result-object v0

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;

    iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p0, p1, v1}, Lnet/youmi/android/offers/d/b/f;->b(Landroid/content/Context;Lnet/youmi/android/offers/EarnPointsOrderInfo;Lnet/youmi/android/a/b/k/a;)V

    move-object v0, v1

    :cond_2
    :goto_2
    invoke-static {}, Lnet/youmi/android/offers/PointsManager;->isEnableEarnPointsNotification()Z

    move-result v1

    if-eqz v1, :cond_0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lnet/youmi/android/a/b/k/j;->b(Landroid/content/Context;Ljava/lang/String;)Lnet/youmi/android/a/b/k/a;

    move-result-object v0

    :cond_3
    invoke-static {p0, p1, v0}, Lnet/youmi/android/offers/d/b/f;->a(Landroid/content/Context;Lnet/youmi/android/offers/EarnPointsOrderInfo;Lnet/youmi/android/a/b/k/a;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_4
    invoke-static {p0}, Lnet/youmi/android/a/a/g/g/b;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/g/b;

    move-result-object v0

    new-instance v2, Lnet/youmi/android/a/a/g/g/c;

    invoke-direct {v2}, Lnet/youmi/android/a/a/g/g/c;-><init>()V

    invoke-virtual {p1}, Lnet/youmi/android/offers/EarnPointsOrderInfo;->getOrderID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/a/g/g/c;->a(Ljava/lang/String;)V

    invoke-virtual {p1}, Lnet/youmi/android/offers/EarnPointsOrderInfo;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lnet/youmi/android/a/a/g/g/c;->b(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lnet/youmi/android/a/a/g/g/b;->a(Lnet/youmi/android/a/a/g/g/c;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v1

    goto :goto_2

    :cond_5
    move-object v1, v0

    goto :goto_1
.end method

.method private static a(Landroid/content/Context;Lnet/youmi/android/offers/EarnPointsOrderInfo;Lnet/youmi/android/a/b/k/a;)V
    .locals 7

    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/offers/EarnPointsOrderInfo;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lnet/youmi/android/offers/EarnPointsOrderInfo;->getOrderID()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    invoke-static {p0}, Lnet/youmi/android/a/b/k/o;->a(Landroid/content/Context;)Landroid/app/NotificationManager;

    move-result-object v2

    new-instance v3, Landroid/app/Notification;

    invoke-direct {v3}, Landroid/app/Notification;-><init>()V

    const/16 v4, 0x10

    iput v4, v3, Landroid/app/Notification;->flags:I

    invoke-virtual {p2}, Lnet/youmi/android/a/b/k/a;->c()I

    move-result v4

    iput v4, v3, Landroid/app/Notification;->icon:I

    new-instance v4, Landroid/content/Intent;

    invoke-static {p0}, Lnet/youmi/android/offers/PointsReceiver;->getActionName_ViewPoints(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v5, 0x8000000

    invoke-static {p0, v0, v4, v5}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lnet/youmi/android/a/b/k/a;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->A()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, p0, v5, v1, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    invoke-virtual {v2, v0, v3}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    :goto_1
    return-void

    :cond_0
    new-instance v0, Ljava/util/Random;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ljava/util/Random;-><init>(J)V

    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method private static b(Landroid/content/Context;Lnet/youmi/android/offers/EarnPointsOrderInfo;Lnet/youmi/android/a/b/k/a;)V
    .locals 6

    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/offers/EarnPointsOrderInfo;->getMessage()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    if-nez v1, :cond_0

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_1
    invoke-static {p0}, Lnet/youmi/android/a/b/k/f;->a(Landroid/content/Context;)Lnet/youmi/android/a/b/k/f;

    move-result-object v2

    invoke-virtual {v2}, Lnet/youmi/android/a/b/k/f;->b()I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    int-to-double v2, v0

    const-wide v4, 0x3fe999999999999aL    # 0.8

    mul-double/2addr v2, v4

    double-to-int v0, v2

    :goto_1
    :try_start_2
    new-instance v2, Lnet/youmi/android/offers/d/b/g;

    const/16 v3, 0xdac

    invoke-direct {v2, p0, v1, v3, v0}, Lnet/youmi/android/offers/d/b/g;-><init>(Landroid/content/Context;Ljava/lang/String;II)V

    invoke-static {}, Lnet/youmi/android/a/b/k/m;->a()Lnet/youmi/android/a/b/k/m;

    move-result-object v0

    invoke-virtual {v0, v2}, Lnet/youmi/android/a/b/k/m;->a(Ljava/lang/Runnable;)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_1
.end method
