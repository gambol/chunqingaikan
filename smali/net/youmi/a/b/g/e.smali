.class Lnet/youmi/android/a/b/g/e;
.super Lnet/youmi/android/a/b/j/a;

# interfaces
.implements Lnet/youmi/android/a/b/g/d/e;


# static fields
.field private static a:Lnet/youmi/android/a/b/g/e;

.field private static b:I


# instance fields
.field private c:I

.field private d:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    sput v0, Lnet/youmi/android/a/b/g/e;->b:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lnet/youmi/android/a/b/j/a;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lnet/youmi/android/a/b/g/e;->c:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/e;->d:Ljava/util/HashMap;

    sget v0, Lnet/youmi/android/a/b/g/e;->b:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lnet/youmi/android/a/b/g/e;->b:I

    sget v0, Lnet/youmi/android/a/b/g/e;->b:I

    iput v0, p0, Lnet/youmi/android/a/b/g/e;->c:I

    return-void
.end method

.method public static declared-synchronized a()Lnet/youmi/android/a/b/g/e;
    .locals 2

    const-class v1, Lnet/youmi/android/a/b/g/e;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lnet/youmi/android/a/b/g/e;->a:Lnet/youmi/android/a/b/g/e;

    if-nez v0, :cond_0

    new-instance v0, Lnet/youmi/android/a/b/g/e;

    invoke-direct {v0}, Lnet/youmi/android/a/b/g/e;-><init>()V

    sput-object v0, Lnet/youmi/android/a/b/g/e;->a:Lnet/youmi/android/a/b/g/e;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    :goto_0
    :try_start_1
    sget-object v0, Lnet/youmi/android/a/b/g/e;->a:Lnet/youmi/android/a/b/g/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 5

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/e;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    invoke-interface {v0, p1}, Lnet/youmi/android/a/b/g/d/c;->d(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v4, "download_"

    invoke-static {v4, p0, v0}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    :cond_0
    return-void
.end method

.method public a(Lnet/youmi/android/a/b/g/e/a;IJJJ)V
    .locals 13

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/e;->g()Ljava/util/List;

    move-result-object v10

    if-eqz v10, :cond_0

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v10}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v11

    move v9, v0

    :goto_0
    if-ge v9, v11, :cond_0

    :try_start_1
    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    move-object v1, p1

    move-wide/from16 v2, p5

    move-wide/from16 v4, p7

    move v6, p2

    move-wide/from16 v7, p3

    invoke-interface/range {v0 .. v8}, Lnet/youmi/android/a/b/g/d/c;->a(Lnet/youmi/android/a/b/g/e/a;JJIJ)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    add-int/lit8 v0, v9, 0x1

    move v9, v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v1, "download_"

    invoke-static {v1, p0, v0}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    :cond_0
    return-void
.end method

.method public a(Landroid/content/Context;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/b;)Z
    .locals 4

    const/4 v1, 0x1

    const/4 v0, 0x0

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/e/a;->d()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lnet/youmi/android/a/b/g/e;->d:Ljava/util/HashMap;

    invoke-virtual {v2, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    new-instance v2, Lnet/youmi/android/a/b/g/a/d;

    invoke-direct {v2, p1, p2, p3, p0}, Lnet/youmi/android/a/b/g/a/d;-><init>(Landroid/content/Context;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/b;Lnet/youmi/android/a/b/g/d/e;)V

    iget-object v3, p0, Lnet/youmi/android/a/b/g/e;->d:Ljava/util/HashMap;

    invoke-virtual {v3, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2}, Lnet/youmi/android/a/b/g/a/b;->a(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public b(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 5

    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/e;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    invoke-interface {v0, p1}, Lnet/youmi/android/a/b/g/d/c;->e(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v4, "download_"

    invoke-static {v4, p0, v0}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_2
    return-void

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/e;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2
.end method

.method public c(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 5

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/e;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    invoke-interface {v0, p1}, Lnet/youmi/android/a/b/g/d/c;->f(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v4, "download_"

    invoke-static {v4, p0, v0}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_2
    return-void

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/e;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2
.end method

.method public d(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 5

    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/e;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    invoke-interface {v0, p1}, Lnet/youmi/android/a/b/g/d/c;->h_(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v4, "download_"

    invoke-static {v4, p0, v0}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_2
    return-void

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/e;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2
.end method

.method public e(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 5

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/e;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    invoke-interface {v0, p1}, Lnet/youmi/android/a/b/g/d/c;->g(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v4, "download_"

    invoke-static {v4, p0, v0}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V

    goto :goto_1

    :catch_1
    move-exception v0

    :goto_2
    return-void

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/e;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_2
.end method

.method public f(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 5

    :try_start_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/e;->g()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v3

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/c;

    invoke-interface {v0, p1}, Lnet/youmi/android/a/b/g/d/c;->c(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    const-string v4, "download_"

    invoke-static {v4, p0, v0}, Lnet/youmi/android/a/b/e/b;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    :cond_0
    return-void
.end method
