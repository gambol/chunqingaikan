.class public Lnet/youmi/android/offers/d/b/h;
.super Ljava/lang/Object;


# static fields
.field private static a:Landroid/app/PendingIntent;

.field private static b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, -0x1

    sput v0, Lnet/youmi/android/offers/d/b/h;->b:I

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 1

    :try_start_0
    invoke-static {}, Lnet/youmi/android/offers/OffersManager;->isUsingServerCallBack()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/offers/d/b/i;

    invoke-direct {v0, p0}, Lnet/youmi/android/offers/d/b/i;-><init>(Landroid/content/Context;)V

    invoke-static {v0}, Lnet/youmi/android/a/c/a;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;J)V
    .locals 9

    :try_start_0
    invoke-static {}, Lnet/youmi/android/offers/OffersManager;->isUsingServerCallBack()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gtz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7}, Lnet/youmi/android/a/b/k/o;->e(Landroid/content/Context;)Landroid/app/AlarmManager;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v2, p1

    const-wide/32 v4, 0xea60

    invoke-static {v7}, Lnet/youmi/android/offers/d/b/h;->e(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v6

    invoke-virtual/range {v0 .. v6}, Landroid/app/AlarmManager;->setInexactRepeating(IJJLandroid/app/PendingIntent;)V

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v1, Lnet/youmi/android/offers/d/b/j;

    invoke-direct {v1, v7}, Lnet/youmi/android/offers/d/b/j;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1, p1, p2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {p0}, Lnet/youmi/android/offers/d/b/k;->b(Landroid/content/Context;)V

    invoke-static {v0}, Lnet/youmi/android/a/b/k/o;->e(Landroid/content/Context;)Landroid/app/AlarmManager;

    move-result-object v1

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/h;->e(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public static c(Landroid/content/Context;)V
    .locals 1

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/offers/d/b/k;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lnet/youmi/android/offers/d/b/h;->b(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic d(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 1

    invoke-static {p0}, Lnet/youmi/android/offers/d/b/h;->e(Landroid/content/Context;)Landroid/app/PendingIntent;

    move-result-object v0

    return-object v0
.end method

.method private static e(Landroid/content/Context;)Landroid/app/PendingIntent;
    .locals 4

    sget-object v0, Lnet/youmi/android/offers/d/b/h;->a:Landroid/app/PendingIntent;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lnet/youmi/android/offers/f;

    invoke-direct {v1}, Lnet/youmi/android/offers/f;-><init>()V

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lnet/youmi/android/AdService;

    invoke-direct {v2, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v2}, Lnet/youmi/android/offers/f;->a(Landroid/content/Intent;)V

    invoke-static {v0}, Lnet/youmi/android/offers/d/b/h;->f(Landroid/content/Context;)I

    move-result v1

    const/high16 v3, 0x8000000

    invoke-static {v0, v1, v2, v3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    sput-object v0, Lnet/youmi/android/offers/d/b/h;->a:Landroid/app/PendingIntent;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    sget-object v0, Lnet/youmi/android/offers/d/b/h;->a:Landroid/app/PendingIntent;

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private static f(Landroid/content/Context;)I
    .locals 5

    const/4 v4, -0x1

    sget v0, Lnet/youmi/android/offers/d/b/h;->b:I

    if-ne v4, v0, :cond_1

    :try_start_0
    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lnet/youmi/android/a/c/c/a;->f(Landroid/content/Context;)I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lnet/youmi/android/a/b/b/e;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x9

    if-le v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x9

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, -0x5

    sput v0, Lnet/youmi/android/offers/d/b/h;->b:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    sget v0, Lnet/youmi/android/offers/d/b/h;->b:I

    if-ne v4, v0, :cond_1

    const v0, 0x6db36d0

    sput v0, Lnet/youmi/android/offers/d/b/h;->b:I

    :cond_1
    sget v0, Lnet/youmi/android/offers/d/b/h;->b:I

    return v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method
