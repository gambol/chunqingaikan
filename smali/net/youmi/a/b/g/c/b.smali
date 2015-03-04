.class Lnet/youmi/android/a/b/g/c/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/b/g/c/a;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/b/g/c/a;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/b/g/c/b;->a:Lnet/youmi/android/a/b/g/c/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    const-wide/16 v4, 0x0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/c/b;->a:Lnet/youmi/android/a/b/g/c/a;

    invoke-static {v0}, Lnet/youmi/android/a/b/g/c/a;->a(Lnet/youmi/android/a/b/g/c/a;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lnet/youmi/android/a/b/g/c/b;->a:Lnet/youmi/android/a/b/g/c/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/b/g/c/a;->a()[Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v0, 0x0

    move v2, v0

    move-wide v0, v4

    :goto_1
    array-length v7, v3

    if-ge v2, v7, :cond_4

    aget-object v7, v3, v2

    iget-object v8, p0, Lnet/youmi/android/a/b/g/c/b;->a:Lnet/youmi/android/a/b/g/c/a;

    invoke-static {v8, v7}, Lnet/youmi/android/a/b/g/c/a;->a(Lnet/youmi/android/a/b/g/c/a;Ljava/io/File;)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v7}, Ljava/io/File;->delete()Z

    :cond_2
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-eqz v8, :cond_2

    iget-object v8, p0, Lnet/youmi/android/a/b/g/c/b;->a:Lnet/youmi/android/a/b/g/c/a;

    invoke-static {v8}, Lnet/youmi/android/a/b/g/c/a;->b(Lnet/youmi/android/a/b/g/c/a;)J

    move-result-wide v8

    const-wide/16 v10, -0x1

    cmp-long v8, v8, v10

    if-eqz v8, :cond_2

    iget-object v8, p0, Lnet/youmi/android/a/b/g/c/b;->a:Lnet/youmi/android/a/b/g/c/a;

    invoke-static {v8}, Lnet/youmi/android/a/b/g/c/a;->b(Lnet/youmi/android/a/b/g/c/a;)J

    move-result-wide v8

    cmp-long v8, v8, v4

    if-lez v8, :cond_2

    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v8

    add-long/2addr v0, v8

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_4
    new-instance v2, Lnet/youmi/android/a/b/g/c/c;

    iget-object v3, p0, Lnet/youmi/android/a/b/g/c/b;->a:Lnet/youmi/android/a/b/g/c/a;

    invoke-direct {v2, v3}, Lnet/youmi/android/a/b/g/c/c;-><init>(Lnet/youmi/android/a/b/g/c/a;)V

    invoke-static {v6, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/16 v2, 0x2710

    move v4, v2

    move-wide v2, v0

    :goto_3
    iget-object v0, p0, Lnet/youmi/android/a/b/g/c/b;->a:Lnet/youmi/android/a/b/g/c/a;

    invoke-static {v0}, Lnet/youmi/android/a/b/g/c/a;->b(Lnet/youmi/android/a/b/g/c/a;)J

    move-result-wide v0

    cmp-long v0, v2, v0

    if-lez v0, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_0

    :try_start_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v6

    sub-long/2addr v2, v6

    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    invoke-virtual {v0}, Ljava/io/File;->delete()Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :goto_4
    add-int/lit8 v0, v4, -0x1

    if-ltz v0, :cond_0

    move v4, v0

    goto :goto_3

    :catch_1
    move-exception v0

    move-wide v0, v2

    move-wide v2, v0

    goto :goto_4
.end method
