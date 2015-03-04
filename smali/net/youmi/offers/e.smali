.class public Lnet/youmi/android/offers/e;
.super Lnet/youmi/android/offers/PointsReceiver;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnet/youmi/android/offers/PointsReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method protected onEarnPoints(Landroid/content/Context;Lnet/youmi/android/offers/EarnPointsOrderList;)V
    .locals 0

    return-void
.end method

.method protected onViewPoints(Landroid/content/Context;)V
    .locals 5

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p1}, Lnet/youmi/android/a/b/k/o;->f(Landroid/content/Context;)Landroid/app/ActivityManager;

    move-result-object v0

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, Landroid/app/ActivityManager;->getRunningTasks(I)Ljava/util/List;

    move-result-object v3

    move v2, v1

    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ge v2, v0, :cond_2

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningTaskInfo;

    iget-object v4, v0, Landroid/app/ActivityManager$RunningTaskInfo;->baseActivity:Landroid/content/ComponentName;

    iget-object v0, v0, Landroid/app/ActivityManager$RunningTaskInfo;->topActivity:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_0

    invoke-static {p1}, Lnet/youmi/android/offers/OffersManager;->getInstance(Landroid/content/Context;)Lnet/youmi/android/offers/OffersManager;

    move-result-object v0

    const/high16 v1, 0x30020000

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lnet/youmi/android/offers/OffersManager;->a(II)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_2
    return-void

    :cond_1
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_2
    move v0, v1

    goto :goto_1
.end method
