.class public abstract Lnet/youmi/android/a/b/g/d;
.super Lnet/youmi/android/a/b/j/a;

# interfaces
.implements Lnet/youmi/android/a/b/g/d/b;
.implements Lnet/youmi/android/a/b/g/d/c;
.implements Lnet/youmi/android/a/b/g/d/f;


# instance fields
.field private a:Ljava/util/HashSet;

.field private b:Ljava/util/HashSet;

.field private c:Ljava/util/HashMap;

.field protected d:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Lnet/youmi/android/a/b/j/a;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lnet/youmi/android/a/b/g/d;->d:Landroid/content/Context;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/d;->c:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/d;->a:Ljava/util/HashSet;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/g/d;->b:Ljava/util/HashSet;

    invoke-static {}, Lnet/youmi/android/a/b/g/e;->a()Lnet/youmi/android/a/b/g/e;

    move-result-object v0

    invoke-virtual {v0, p0}, Lnet/youmi/android/a/b/g/e;->a(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected a(Lnet/youmi/android/a/b/g/e/a;Ljava/lang/String;)Ljava/io/File;
    .locals 2

    :try_start_0
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/d;->a(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/b/g/c/a;

    move-result-object v0

    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/d;->a()Lnet/youmi/android/a/b/g/b/b;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lnet/youmi/android/a/b/g/b/b;->a(Lnet/youmi/android/a/b/g/e/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/b/g/c/a;->c(Ljava/lang/String;)Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected abstract a()Lnet/youmi/android/a/b/g/b/b;
.end method

.method protected abstract a(Lnet/youmi/android/a/b/g/e/a;)Lnet/youmi/android/a/b/g/c/a;
.end method

.method protected abstract a(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method protected abstract a(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;JJIJ)V
.end method

.method public final a(Lnet/youmi/android/a/b/g/e/a;JJIJ)V
    .locals 12

    if-nez p1, :cond_1

    :cond_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/d;->b:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/d;->g()Ljava/util/List;

    move-result-object v11

    const/4 v0, 0x0

    :goto_1
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    :try_start_1
    invoke-interface {v11, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    move-object v1, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide/from16 v6, p4

    move/from16 v8, p6

    move-wide/from16 v9, p7

    invoke-virtual/range {v1 .. v10}, Lnet/youmi/android/a/b/g/d;->a(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;JJIJ)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public a(Lnet/youmi/android/a/b/g/g/a;)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/d;->a:Ljava/util/HashSet;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-eqz p1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/g/d;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method public a(Lnet/youmi/android/a/b/g/g/a;Lnet/youmi/android/a/b/g/e/a;)V
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/d;->a:Ljava/util/HashSet;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-eqz p1, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/g/d;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    :try_start_0
    invoke-virtual {p0, p2}, Lnet/youmi/android/a/b/g/d;->f(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public final a(Lnet/youmi/android/a/b/g/g/a;Lnet/youmi/android/a/b/g/e/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p2, :cond_0

    :try_start_0
    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/e/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2, p4}, Lnet/youmi/android/a/b/g/d;->a(Lnet/youmi/android/a/b/g/e/a;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {p2, v0}, Lnet/youmi/android/a/b/g/e/a;->a(Ljava/io/File;)V

    invoke-static {}, Lnet/youmi/android/a/b/g/e;->a()Lnet/youmi/android/a/b/g/e;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/a/b/g/d;->d:Landroid/content/Context;

    invoke-virtual {v0, v1, p2, p0}, Lnet/youmi/android/a/b/g/e;->a(Landroid/content/Context;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/a/b/g/d;->b:Ljava/util/HashSet;

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lnet/youmi/android/a/b/g/d;->c:Ljava/util/HashMap;

    invoke-virtual {p2}, Lnet/youmi/android/a/b/g/e/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/d;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lnet/youmi/android/a/b/g/d;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/g/d;->d:Landroid/content/Context;

    return-object v0
.end method

.method protected abstract b(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method protected abstract b(Ljava/lang/String;)Z
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    const/4 v1, 0x1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_0

    iget-object v3, p0, Lnet/youmi/android/a/b/g/d;->c:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v2}, Lnet/youmi/android/a/b/g/d;->c(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v3

    if-eqz v3, :cond_3

    :try_start_1
    new-instance v3, Lnet/youmi/android/a/b/g/g/a;

    iget-object v4, p0, Lnet/youmi/android/a/b/g/d;->d:Landroid/content/Context;

    invoke-direct {v3, v4, p0, v2, p2}, Lnet/youmi/android/a/b/g/g/a;-><init>(Landroid/content/Context;Lnet/youmi/android/a/b/g/d/f;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lnet/youmi/android/a/b/g/d;->a:Ljava/util/HashSet;

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    new-instance v2, Ljava/lang/Thread;

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2

    :goto_1
    :try_start_3
    invoke-virtual {v3}, Lnet/youmi/android/a/b/g/g/a;->b()V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1

    move v0, v1

    goto :goto_0

    :cond_3
    :try_start_4
    new-instance v3, Lnet/youmi/android/a/b/g/e/a;

    invoke-direct {v3, v2, p2}, Lnet/youmi/android/a/b/g/e/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-virtual {p0, v3, v4}, Lnet/youmi/android/a/b/g/d;->a(Lnet/youmi/android/a/b/g/e/a;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v3, v4}, Lnet/youmi/android/a/b/g/e/a;->a(Ljava/io/File;)V

    invoke-static {}, Lnet/youmi/android/a/b/g/e;->a()Lnet/youmi/android/a/b/g/e;

    move-result-object v4

    iget-object v5, p0, Lnet/youmi/android/a/b/g/d;->d:Landroid/content/Context;

    invoke-virtual {v4, v5, v3, p0}, Lnet/youmi/android/a/b/g/e;->a(Landroid/content/Context;Lnet/youmi/android/a/b/g/e/a;Lnet/youmi/android/a/b/g/d/b;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lnet/youmi/android/a/b/g/d;->b:Ljava/util/HashSet;

    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lnet/youmi/android/a/b/g/d;->c:Ljava/util/HashMap;

    invoke-virtual {v4, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0

    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_0

    :catch_2
    move-exception v2

    goto :goto_1
.end method

.method protected abstract c(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method public final c(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 3

    if-nez p1, :cond_1

    :cond_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/d;->b:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    :try_start_1
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/d;->k(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/d;->g()Ljava/util/List;

    move-result-object v1

    const/4 v0, 0x0

    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    :try_start_2
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v2, p1}, Lnet/youmi/android/a/b/g/d;->f(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :cond_2
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v2

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method protected c(Ljava/lang/String;)Z
    .locals 3

    const/4 v0, 0x1

    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Landroid/net/Uri;->getFragment()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/d;->b(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method protected abstract d(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method public final d(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 3

    if-nez p1, :cond_1

    :cond_0
    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/b/g/d;->b:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    :try_start_1
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/d;->l(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/d;->g()Ljava/util/List;

    move-result-object v1

    const/4 v0, 0x0

    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    :try_start_2
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v2, p1}, Lnet/youmi/android/a/b/g/d;->e(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_1

    :cond_2
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v2

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_0
.end method

.method protected abstract e(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method public final e(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 3

    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/d;->q(Lnet/youmi/android/a/b/g/e/a;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/d;->m(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/d;->g()Ljava/util/List;

    move-result-object v1

    const/4 v0, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    :try_start_1
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v2, p1}, Lnet/youmi/android/a/b/g/d;->d(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_2
.end method

.method protected abstract f(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method public final f(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 3

    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/d;->q(Lnet/youmi/android/a/b/g/e/a;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/d;->n(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/d;->g()Ljava/util/List;

    move-result-object v1

    const/4 v0, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    :try_start_1
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v2, p1}, Lnet/youmi/android/a/b/g/d;->c(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_2
.end method

.method public final g(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 3

    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/d;->q(Lnet/youmi/android/a/b/g/e/a;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/d;->o(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/d;->g()Ljava/util/List;

    move-result-object v1

    const/4 v0, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    :try_start_1
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v2, p1}, Lnet/youmi/android/a/b/g/d;->b(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_2
.end method

.method public g_(Lnet/youmi/android/a/b/g/e/a;)Z
    .locals 6

    const/4 v1, 0x1

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->f()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->e()J
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-gtz v2, :cond_0

    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0
.end method

.method public final h_(Lnet/youmi/android/a/b/g/e/a;)V
    .locals 3

    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/d;->q(Lnet/youmi/android/a/b/g/e/a;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    :try_start_0
    invoke-virtual {p0, p1}, Lnet/youmi/android/a/b/g/d;->p(Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-virtual {p0}, Lnet/youmi/android/a/b/g/d;->g()Ljava/util/List;

    move-result-object v1

    const/4 v0, 0x0

    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    :try_start_1
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v2, p1}, Lnet/youmi/android/a/b/g/d;->a(Ljava/lang/Object;Lnet/youmi/android/a/b/g/e/a;)V
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_2
.end method

.method public i(Lnet/youmi/android/a/b/g/e/a;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->f()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v1

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lnet/youmi/android/a/b/d/g;->a(Ljava/io/File;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->e()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_0

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->e()J

    move-result-wide v2

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->g()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->length()J
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v4

    cmp-long v1, v2, v4

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method protected abstract k(Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method protected abstract l(Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method protected abstract m(Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method protected abstract n(Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method protected abstract o(Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method protected abstract p(Lnet/youmi/android/a/b/g/e/a;)V
.end method

.method public q(Lnet/youmi/android/a/b/g/e/a;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    :try_start_0
    iget-object v2, p0, Lnet/youmi/android/a/b/g/d;->c:Ljava/util/HashMap;

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    if-eqz v2, :cond_3

    :try_start_1
    iget-object v1, p0, Lnet/youmi/android/a/b/g/d;->c:Ljava/util/HashMap;

    invoke-virtual {p1}, Lnet/youmi/android/a/b/g/e/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    if-eqz v1, :cond_2

    :cond_2
    move v1, v0

    :cond_3
    :try_start_2
    iget-object v2, p0, Lnet/youmi/android/a/b/g/d;->b:Ljava/util/HashSet;

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0

    move-result v2

    if-eqz v2, :cond_4

    :try_start_3
    iget-object v1, p0, Lnet/youmi/android/a/b/g/d;->b:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :catch_0
    move-exception v0

    move v0, v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_0
.end method
