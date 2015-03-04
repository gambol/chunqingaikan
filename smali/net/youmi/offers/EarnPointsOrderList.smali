.class public Lnet/youmi/android/offers/EarnPointsOrderList;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:Ljava/util/ArrayList;

.field private b:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private declared-synchronized a()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/EarnPointsOrderList;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/offers/EarnPointsOrderList;->a:Ljava/util/ArrayList;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method a(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lnet/youmi/android/a/b/b/e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    iput-object v0, p0, Lnet/youmi/android/offers/EarnPointsOrderList;->b:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method a(Lnet/youmi/android/offers/EarnPointsOrderInfo;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-direct {p0}, Lnet/youmi/android/offers/EarnPointsOrderList;->a()V

    iget-object v0, p0, Lnet/youmi/android/offers/EarnPointsOrderList;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public get(I)Lnet/youmi/android/offers/EarnPointsOrderInfo;
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lnet/youmi/android/offers/EarnPointsOrderList;->a:Ljava/util/ArrayList;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    if-ltz p1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/offers/EarnPointsOrderList;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/offers/EarnPointsOrderList;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/offers/EarnPointsOrderInfo;

    goto :goto_0
.end method

.method public getCurrencyName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/offers/EarnPointsOrderList;->b:Ljava/lang/String;

    return-object v0
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lnet/youmi/android/offers/EarnPointsOrderList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/offers/EarnPointsOrderList;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/offers/EarnPointsOrderList;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0
.end method
