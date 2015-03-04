.class public Lnet/youmi/android/offers/d/b/a;
.super Ljava/lang/Object;

# interfaces
.implements Lnet/youmi/android/offers/PointsChangeNotify;


# static fields
.field private static b:Lnet/youmi/android/offers/d/b/a;


# instance fields
.field private a:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/offers/d/b/a;->a:Ljava/util/HashSet;

    return-void
.end method

.method public static declared-synchronized a()Lnet/youmi/android/offers/d/b/a;
    .locals 2

    const-class v1, Lnet/youmi/android/offers/d/b/a;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/offers/d/b/a;->b:Lnet/youmi/android/offers/d/b/a;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/offers/d/b/a;

    invoke-direct {v0}, Lnet/youmi/android/offers/d/b/a;-><init>()V

    sput-object v0, Lnet/youmi/android/offers/d/b/a;->b:Lnet/youmi/android/offers/d/b/a;

    :cond_0
    sget-object v0, Lnet/youmi/android/offers/d/b/a;->b:Lnet/youmi/android/offers/d/b/a;
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

    iget-object v1, p0, Lnet/youmi/android/offers/d/b/a;->a:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onPointBalanceChange(I)V
    .locals 5

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/d/b/a;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/offers/d/b/a;->a:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-gtz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/offers/d/b/a;->a:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_0

    :try_start_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_3

    const/4 v0, 0x0

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    invoke-virtual {v2, v0, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/e/g/f;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/f;->d()Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "javascript:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/f;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const/16 v4, 0x28

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ");"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lnet/youmi/android/a/a/e/f/a;->a()Lnet/youmi/android/a/a/e/f/a;

    move-result-object v4

    invoke-virtual {v0}, Lnet/youmi/android/a/a/e/g/f;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v3}, Lnet/youmi/android/a/a/e/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method
