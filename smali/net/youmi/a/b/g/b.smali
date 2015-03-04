.class public abstract Lnet/youmi/android/a/b/g/b;
.super Lnet/youmi/android/a/b/j/a;

# interfaces
.implements Lnet/youmi/android/a/b/g/d/b;
.implements Lnet/youmi/android/a/b/g/d/c;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lnet/youmi/android/a/b/g/c/a;

.field private c:Ljava/util/HashMap;

.field private d:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lnet/youmi/android/a/b/g/c/a;)V
    .locals 2

    invoke-direct {p0}, Lnet/youmi/android/a/b/j/a;-><init>()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "context is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/b/g/b;->a:Landroid/content/Context;

    if-nez p2, :cond_1

    new-instance v0, Ljava/io/IOException;

    const-string v1, "Cache Directory is null"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput-object p2, p0, Lnet/youmi/android/a/b/g/b;->b:Lnet/youmi/android/a/b/g/c/a;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/b;->c:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/b;->d:Ljava/util/HashSet;

    invoke-static {}, Lnet/youmi/android/a/b/g/e;->a()Lnet/youmi/android/a/b/g/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/b/g/e;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected a(Ljava/io/File;)Landroid/graphics/Bitmap;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-nez v2, :cond_0

    move-object v0, v1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    new-instance v2, Lnet/youmi/android/a/b/g/e/a;

    invoke-direct {v2, p1}, Lnet/youmi/android/a/b/g/e/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lnet/youmi/android/a/b/g/e/a;->d()Z

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, v2}, Lnet/youmi/android/a/b/g/b;->a(Lnet/youmi/android/a/b/g/e/a;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v2}, Lnet/youmi/android/a/b/g/b;->b(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method protected a(Lnet/youmi/android/a/b/g/e/a;)Landroid/graphics/Bitmap;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/b;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/b;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/b;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    :goto_1
    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public final a(Lnet/youmi/android/a/b/g/e/a;JJIJ)V
    .locals 0

    return-void
.end method

.method protected a(Lnet/youmi/android/a/b/g/e/a;Landroid/graphics/Bitmap;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/b;->a(Lnet/youmi/android/a/b/g/e/a;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_1

    move v2, v0

    :goto_0
    if-nez p2, :cond_2

    move v0, v2

    :cond_0
    :goto_1
    return v0

    :cond_1
    move v2, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-eqz v3, :cond_3

    move v0, v2

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lnet/youmi/android/a/b/g/b;->c:Ljava/util/HashMap;

    new-instance v3, Ljava/lang/ref/SoftReference;

    invoke-direct {v3, p2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_1

    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_1
.end method

.method protected b(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/b;->b:Lnet/youmi/android/a/b/g/c/a;

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/g/c/a;->c(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {p1, v0}, Lnet/youmi/android/a/b/g/e/a;->a(Ljava/io/File;)V

    iget-object v0, p0, Lnet/youmi/android/a/b/g/b;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-static {}, Lnet/youmi/android/a/b/g/e;->a()Lnet/youmi/android/a/b/g/e;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/b/g/b;->a:Landroid/content/Context;

    invoke-virtual {v0, v1, p1, p0}, Lnet/youmi/android/a/b/g/e;->a(Landroid/content/Context;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/b;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/g/b;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final c(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    return-void
.end method

.method public final d(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    return-void
.end method

.method public final e(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 5

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/b;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    :try_start_1
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/b;->a(Lnet/youmi/android/a/b/g/e/a;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    if-nez v0, :cond_2

    :try_start_2
    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v1

    invoke-virtual {p0, v1}, Lnet/youmi/android/a/b/g/b;->a(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lnet/youmi/android/a/b/g/b;->a(Lnet/youmi/android/a/b/g/e/a;Landroid/graphics/Bitmap;)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-object v2, v0

    :goto_2
    if-eqz v2, :cond_0

    :try_start_3
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/b;->g()Ljava/util/List;

    move-result-object v3

    const/4 v0, 0x0

    move v1, v0

    :goto_3
    invoke-interface {v3}, Ljava/util/List;->size()I
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1

    move-result v0

    if-ge v1, v0, :cond_0

    :try_start_4
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/g;

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v2}, Lnet/youmi/android/a/b/g/d/g;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2

    :goto_4
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_3

    :catch_0
    move-exception v1

    move-object v2, v0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_0

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v0

    goto :goto_1

    :cond_2
    move-object v2, v0

    goto :goto_2
.end method

.method public final f(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 4

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/b;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    :try_start_1
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/b;->g()Ljava/util/List;

    move-result-object v2

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    if-ge v1, v0, :cond_0

    :try_start_2
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/g;

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lnet/youmi/android/a/b/g/d/g;->a(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :goto_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method public final g(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 4

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/b;->d:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    move-result v0

    if-eqz v0, :cond_0

    :goto_1
    :try_start_1
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/b;->g()Ljava/util/List;

    move-result-object v2

    const/4 v0, 0x0

    move v1, v0

    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    move-result v0

    if-ge v1, v0, :cond_0

    :try_start_2
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/b/g/d/g;

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lnet/youmi/android/a/b/g/d/g;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :goto_3
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method public g_(Lnet/youmi/android/a/b/g/e/a;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h_(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/b;->e(Lnet/youmi/android/a/b/g/e/a;)V

    return-void
.end method

.method public i(Lnet/youmi/android/a/b/g/e/a;)Z
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v1

    invoke-virtual {p0, v1}, Lnet/youmi/android/a/b/g/b;->a(Ljava/io/File;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    invoke-virtual {p0, p1, v1}, Lnet/youmi/android/a/b/g/b;->a(Lnet/youmi/android/a/b/g/e/a;Landroid/graphics/Bitmap;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return v0

    :catch_0
    move-exception v1

    goto :goto_0
.end method
