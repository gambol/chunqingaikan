.class public Lnet/youmi/android/offers/b;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/offers/PointsEarnNotify;


# static fields
.field private static b:Lnet/youmi/android/offers/b;


# instance fields
.field private a:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/offers/b;->a:Ljava/util/HashSet;

    return-void
.end method

.method public static declared-synchronized a()Lnet/youmi/android/offers/b;
    .locals 2

    const-class v1, Lnet/youmi/android/offers/b;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/offers/b;->b:Lnet/youmi/android/offers/b;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/offers/b;

    invoke-direct {v0}, Lnet/youmi/android/offers/b;-><init>()V

    sput-object v0, Lnet/youmi/android/offers/b;->b:Lnet/youmi/android/offers/b;

    :cond_0
    sget-object v0, Lnet/youmi/android/offers/b;->b:Lnet/youmi/android/offers/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/e/g/f;

    invoke-direct {v0, p1, p2}, Lnet/youmi/android/a/a/e/g/f;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/f;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/offers/b;->a:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onPointEarn(Landroid/content/Context;Lnet/youmi/android/offers/EarnPointsOrderList;)V
    .locals 6

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lnet/youmi/android/offers/b;->a:Ljava/util/HashSet;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/offers/b;->a:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->size()I

    move-result v1

    if-gtz v1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v1, p0, Lnet/youmi/android/offers/b;->a:Ljava/util/HashSet;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    if-eqz v2, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move v1, v0

    :goto_1
    invoke-virtual {p2}, Lnet/youmi/android/offers/EarnPointsOrderList;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    :cond_2
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_4

    :try_start_1
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_3

    const/4 v0, 0x0

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    invoke-virtual {v3, v0, v4}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/e/g/f;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/f;->d()Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v4, "javascript:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/f;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const/16 v5, 0x28

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p2, v1}, Lnet/youmi/android/offers/EarnPointsOrderList;->get(I)Lnet/youmi/android/offers/EarnPointsOrderInfo;

    move-result-object v5

    invoke-virtual {v5}, Lnet/youmi/android/offers/EarnPointsOrderInfo;->a()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ","

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {p2, v1}, Lnet/youmi/android/offers/EarnPointsOrderList;->get(I)Lnet/youmi/android/offers/EarnPointsOrderInfo;

    move-result-object v5

    invoke-virtual {v5}, Lnet/youmi/android/offers/EarnPointsOrderInfo;->getPoints()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ");"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lnet/youmi/android/a/a/e/f/a;->a()Lnet/youmi/android/a/a/e/f/a;

    move-result-object v5

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0, v4}, Lnet/youmi/android/a/a/e/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_4
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto/16 :goto_0
.end method
