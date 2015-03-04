.class public Lnet/youmi/android/offers/c/b/a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Landroid/content/Context;

.field private b:J

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:Ljava/lang/String;

.field private l:Ljava/util/List;

.field private m:Ljava/util/List;

.field private n:Ljava/util/List;

.field private o:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;JLjava/lang/String;IIIIII)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lnet/youmi/android/offers/c/b/a;->d:Ljava/lang/String;

    iput-wide p3, p0, Lnet/youmi/android/offers/c/b/a;->b:J

    iput-object p5, p0, Lnet/youmi/android/offers/c/b/a;->c:Ljava/lang/String;

    iput p6, p0, Lnet/youmi/android/offers/c/b/a;->e:I

    iput p7, p0, Lnet/youmi/android/offers/c/b/a;->f:I

    iput p8, p0, Lnet/youmi/android/offers/c/b/a;->g:I

    iput p9, p0, Lnet/youmi/android/offers/c/b/a;->h:I

    iput p10, p0, Lnet/youmi/android/offers/c/b/a;->i:I

    iput p11, p0, Lnet/youmi/android/offers/c/b/a;->j:I

    return-void
.end method

.method private a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    new-instance v1, Lnet/youmi/android/a/b/i/a/b;

    invoke-direct {v1}, Lnet/youmi/android/a/b/i/a/b;-><init>()V

    const-string v0, "wl"

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/b/i/a/b;->a(Ljava/lang/String;)V

    iget v0, p0, Lnet/youmi/android/offers/c/b/a;->e:I

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    const-string v0, "a_w_np"

    :goto_0
    invoke-virtual {v1, v0}, Lnet/youmi/android/a/b/i/a/b;->b(Ljava/lang/String;)V

    const/16 v0, 0x1f4

    invoke-virtual {v1, v0}, Lnet/youmi/android/a/b/i/a/b;->a(I)V

    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    invoke-static {v0, p1, v1}, Lnet/youmi/android/a/c/d/c;->a(Landroid/content/Context;Ljava/lang/String;Lnet/youmi/android/a/b/i/a/b;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "a_w_req"

    goto :goto_0
.end method

.method private a(ILjava/lang/String;)V
    .locals 4

    packed-switch p1, :pswitch_data_0

    :goto_0
    return-void

    :pswitch_0
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x32

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/offers/c/b/a;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lnet/youmi/android/offers/c/b/a;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lnet/youmi/android/a/a/e/f/a;->a()Lnet/youmi/android/a/a/e/f/a;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/offers/c/b/a;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lnet/youmi/android/a/a/e/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_0

    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "javascript:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/offers/c/b/a;->c:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lnet/youmi/android/offers/c/b/a;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Lnet/youmi/android/a/a/e/f/a;->a()Lnet/youmi/android/a/a/e/f/a;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/offers/c/b/a;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lnet/youmi/android/a/a/e/f/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private a()Z
    .locals 6

    const/4 v5, 0x2

    const/4 v4, -0x1

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->e:I

    if-ge v2, v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->f:I

    if-lt v2, v1, :cond_0

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->g:I

    const/4 v3, 0x4

    if-le v2, v3, :cond_2

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->g:I

    if-lt v2, v1, :cond_0

    :cond_2
    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->h:I

    if-eq v2, v4, :cond_3

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->h:I

    if-eqz v2, :cond_3

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->h:I

    if-ne v2, v1, :cond_0

    :cond_3
    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->i:I

    if-eq v2, v4, :cond_4

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->i:I

    if-eq v2, v1, :cond_4

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->i:I

    if-ne v2, v5, :cond_0

    :cond_4
    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->j:I

    if-eq v2, v4, :cond_5

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->j:I

    if-eq v2, v1, :cond_5

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->j:I

    if-ne v2, v5, :cond_0

    :cond_5
    move v0, v1

    goto :goto_0
.end method

.method private b()Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    const/4 v3, -0x1

    :try_start_0
    invoke-direct {p0}, Lnet/youmi/android/offers/c/b/a;->a()Z

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    const/16 v2, 0x200

    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    const-string v2, "p="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v2, "&n="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    const-string v2, "&rtype="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->g:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->h:I

    if-eq v2, v3, :cond_1

    const-string v2, "&nshw="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->h:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_1
    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->i:I

    if-eq v2, v3, :cond_2

    const-string v2, "&dtype="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->i:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_2
    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->j:I

    if-eq v2, v3, :cond_3

    const-string v2, "&sp="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget v2, p0, Lnet/youmi/android/offers/c/b/a;->j:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lnet/youmi/android/a/b/d/j;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    invoke-static {}, Lnet/youmi/android/offers/b/b;->j()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x1f4

    invoke-static {v2, v3, v1, v4}, Lnet/youmi/android/a/a/g/d/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method private c()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->l:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/a;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/offers/c/b/a;->l:Ljava/util/List;

    invoke-virtual {v0, v1}, Lnet/youmi/android/a/a/g/a/a/a;->a(Ljava/util/List;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private d()Z
    .locals 10

    const/4 v4, 0x0

    const/4 v2, 0x0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->l:Ljava/util/List;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_5

    move v3, v4

    :goto_0
    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_5

    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->l:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/g/a/b/a;

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->a()Ljava/lang/String;

    move-result-object v5

    iget-object v1, p0, Lnet/youmi/android/offers/c/b/a;->m:Ljava/util/List;

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v6, p0, Lnet/youmi/android/offers/c/b/a;->n:Ljava/util/List;

    if-eqz v6, :cond_0

    iget-object v6, p0, Lnet/youmi/android/offers/c/b/a;->n:Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-lez v6, :cond_0

    iget-object v6, p0, Lnet/youmi/android/offers/c/b/a;->n:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move-object v0, v2

    :goto_1
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    move-object v2, v0

    goto :goto_0

    :cond_0
    iget-object v6, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    invoke-static {v6, v1}, Lnet/youmi/android/a/b/k/j;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->d()I

    move-result v6

    if-nez v6, :cond_8

    iget-object v6, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    invoke-static {v6}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/a;

    move-result-object v6

    invoke-virtual {v6, v5}, Lnet/youmi/android/a/a/g/a/a/a;->a(Ljava/lang/String;)Lnet/youmi/android/a/a/g/a/b/a;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Lnet/youmi/android/a/a/g/a/b/a;->d()I

    move-result v7

    if-nez v7, :cond_8

    iget-object v7, p0, Lnet/youmi/android/offers/c/b/a;->o:Ljava/util/List;

    if-nez v7, :cond_1

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, p0, Lnet/youmi/android/offers/c/b/a;->o:Ljava/util/List;

    :cond_1
    new-instance v7, Lnet/youmi/android/a/a/g/a/b/a;

    invoke-direct {v7}, Lnet/youmi/android/a/a/g/a/b/a;-><init>()V

    invoke-virtual {v7, v5}, Lnet/youmi/android/a/a/g/a/b/a;->a(Ljava/lang/String;)V

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Lnet/youmi/android/a/a/g/a/b/a;->b(I)V

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Lnet/youmi/android/a/a/g/a/b/a;->c(I)V

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v7

    const/4 v8, 0x3

    const/4 v9, 0x1

    invoke-virtual {v7, v5, v8, v9}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v7

    const/16 v8, 0xd

    const/4 v9, 0x1

    invoke-virtual {v7, v5, v8, v9}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V

    invoke-virtual {v6, v0}, Lnet/youmi/android/a/a/g/a/a/a;->b(Lnet/youmi/android/a/a/g/a/b/a;)Z

    move-result v7

    if-nez v7, :cond_4

    invoke-virtual {v6, v0}, Lnet/youmi/android/a/a/g/a/a/a;->a(Lnet/youmi/android/a/a/g/a/b/a;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->o:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_2
    if-nez v2, :cond_7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_3
    :try_start_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catch_0
    move-exception v1

    move-object v2, v0

    :goto_4
    if-eqz v2, :cond_3

    :try_start_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lnet/youmi/android/a/a/g/e/c;->a(Landroid/content/Context;Ljava/util/List;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_4

    :cond_3
    :goto_5
    return v4

    :cond_4
    :try_start_3
    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->o:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catch_1
    move-exception v0

    goto :goto_4

    :cond_5
    if-eqz v2, :cond_3

    :try_start_4
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_3

    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    invoke-static {v0, v2}, Lnet/youmi/android/a/a/g/e/c;->a(Landroid/content/Context;Ljava/util/List;)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_5

    :catch_2
    move-exception v0

    goto :goto_5

    :catchall_0
    move-exception v0

    :goto_6
    if-eqz v2, :cond_6

    :try_start_5
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_6

    iget-object v1, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    invoke-static {v1, v2}, Lnet/youmi/android/a/a/g/e/c;->a(Landroid/content/Context;Ljava/util/List;)V
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_3

    :cond_6
    :goto_7
    throw v0

    :catch_3
    move-exception v1

    goto :goto_7

    :catchall_1
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    goto :goto_6

    :catch_4
    move-exception v0

    goto :goto_5

    :cond_7
    move-object v0, v2

    goto :goto_3

    :cond_8
    move-object v0, v2

    goto/16 :goto_1
.end method

.method private e()V
    .locals 8

    const/4 v7, 0x1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_4

    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->l:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/g/a/b/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->a()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lnet/youmi/android/offers/c/b/a;->o:Ljava/util/List;

    if-eqz v3, :cond_1

    iget-object v3, p0, Lnet/youmi/android/offers/c/b/a;->o:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    invoke-static {v3}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/a;

    move-result-object v3

    invoke-virtual {v3, v2}, Lnet/youmi/android/a/a/g/a/a/a;->a(Ljava/lang/String;)Lnet/youmi/android/a/a/g/a/b/a;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->d()I

    move-result v4

    if-ne v4, v7, :cond_2

    invoke-virtual {v3}, Lnet/youmi/android/a/a/g/a/b/a;->d()I

    move-result v4

    if-eq v4, v7, :cond_2

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Lnet/youmi/android/a/a/g/a/b/a;->b(I)V

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v4

    const/4 v5, 0x3

    const/4 v6, 0x1

    invoke-virtual {v4, v2, v5, v6}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V

    :cond_2
    invoke-virtual {v0}, Lnet/youmi/android/a/a/g/a/b/a;->e()I

    move-result v0

    if-ne v0, v7, :cond_3

    invoke-virtual {v3}, Lnet/youmi/android/a/a/g/a/b/a;->e()I

    move-result v0

    if-eq v0, v7, :cond_3

    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Lnet/youmi/android/a/a/g/a/b/a;->c(I)V

    invoke-static {}, Lnet/youmi/android/a/a/g/a/f;->a()Lnet/youmi/android/a/a/g/a/f;

    move-result-object v0

    const/16 v4, 0xd

    const/4 v5, 0x1

    invoke-virtual {v0, v2, v4, v5}, Lnet/youmi/android/a/a/g/a/f;->a(Ljava/lang/String;II)V

    :cond_3
    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    invoke-static {v0}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lnet/youmi/android/a/a/g/a/a/a;->b(Lnet/youmi/android/a/a/g/a/b/a;)Z

    goto :goto_1

    :catch_0
    move-exception v0

    :cond_4
    return-void

    :cond_5
    iget-object v2, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/a;

    move-result-object v2

    invoke-virtual {v2, v0}, Lnet/youmi/android/a/a/g/a/a/a;->a(Lnet/youmi/android/a/a/g/a/b/a;)Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1
.end method

.method private f()Ljava/lang/String;
    .locals 13

    const/4 v4, 0x1

    const/4 v3, 0x0

    const/4 v1, 0x0

    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->k:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v8

    const-string v0, "d"

    invoke-static {v8, v0, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v2, "ad"

    invoke-static {v0, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v9

    if-eqz v9, :cond_3

    move v0, v1

    :goto_0
    invoke-virtual {v9}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_3

    :try_start_0
    invoke-virtual {v9, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v10

    const-string v2, "wadid"

    const/4 v3, 0x0

    invoke-static {v10, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v5

    const-string v2, "pn"

    const/4 v3, 0x0

    invoke-static {v10, v2, v3}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    if-nez v2, :cond_0

    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v3, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const/4 v6, 0x0

    invoke-virtual {v3, v2, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v2

    if-eqz v2, :cond_5

    :try_start_2
    iget v2, v2, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_2

    move v3, v4

    :goto_2
    move v6, v2

    move v7, v3

    :goto_3
    :try_start_3
    iget-object v2, p0, Lnet/youmi/android/offers/c/b/a;->a:Landroid/content/Context;

    invoke-static {v2}, Lnet/youmi/android/a/a/g/a/a/a;->a(Landroid/content/Context;)Lnet/youmi/android/a/a/g/a/a/a;

    move-result-object v2

    invoke-virtual {v2, v5}, Lnet/youmi/android/a/a/g/a/a/a;->a(I)Lnet/youmi/android/a/a/g/a/b/a;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lnet/youmi/android/a/a/g/a/b/a;->d()I

    move-result v3

    invoke-virtual {v2}, Lnet/youmi/android/a/a/g/a/b/a;->e()I

    move-result v2

    move v5, v3

    move v3, v2

    :goto_4
    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    const-string v12, "a"

    if-eqz v7, :cond_2

    move v2, v4

    :goto_5
    invoke-virtual {v11, v12, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "b"

    invoke-virtual {v11, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v2, "c"

    invoke-virtual {v11, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    if-eqz v7, :cond_1

    const-string v2, "d"

    invoke-virtual {v11, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    :cond_1
    const-string v2, "localr"

    invoke-virtual {v10, v2, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    goto :goto_1

    :catch_1
    move-exception v2

    move v2, v1

    :goto_6
    move v6, v1

    move v7, v2

    goto :goto_3

    :cond_2
    move v2, v1

    goto :goto_5

    :cond_3
    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catch_2
    move-exception v2

    move v2, v4

    goto :goto_6

    :cond_4
    move v3, v1

    move v5, v1

    goto :goto_4

    :cond_5
    move v2, v1

    move v3, v1

    goto :goto_2
.end method


# virtual methods
.method public run()V
    .locals 14

    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v0, 0x2

    :try_start_0
    invoke-direct {p0}, Lnet/youmi/android/offers/c/b/a;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v1, "request url invalid, please contract us"

    invoke-static {v1}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v3

    :goto_0
    invoke-direct {p0, v0, v1}, Lnet/youmi/android/offers/c/b/a;->a(ILjava/lang/String;)V

    :goto_1
    return-void

    :cond_0
    :try_start_1
    invoke-direct {p0, v4}, Lnet/youmi/android/offers/c/b/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iput-object v4, p0, Lnet/youmi/android/offers/c/b/a;->k:Ljava/lang/String;

    iget-object v4, p0, Lnet/youmi/android/offers/c/b/a;->k:Ljava/lang/String;

    invoke-static {v4}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    move-object v1, v3

    goto :goto_0

    :cond_1
    :try_start_2
    iget-object v3, p0, Lnet/youmi/android/offers/c/b/a;->k:Ljava/lang/String;

    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->k:Ljava/lang/String;

    invoke-static {v0}, Lnet/youmi/android/a/b/b/b;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v4, "d"

    const/4 v5, 0x0

    invoke-static {v0, v4, v5}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object v5

    if-nez v5, :cond_2

    const-string v0, "can\'t get data of Ad! error key : d"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Throwable; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-direct {p0, v2, v3}, Lnet/youmi/android/offers/c/b/a;->a(ILjava/lang/String;)V

    goto :goto_1

    :cond_2
    :try_start_3
    const-string v0, "u"

    const-string v4, ""

    invoke-static {v5, v0, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, ""

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->I()Ljava/lang/String;

    move-result-object v0

    move-object v4, v0

    :goto_2
    const-string v0, "ts"

    const/4 v6, 0x0

    invoke-static {v5, v0, v6}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v0

    if-nez v0, :cond_5

    move v0, v2

    :goto_3
    if-eqz v0, :cond_3

    invoke-static {}, Lnet/youmi/android/a/a/j/a/b;->a()Lnet/youmi/android/a/a/j/a/b;

    move-result-object v0

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->J()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Lnet/youmi/android/a/a/j/a/b;->a(Ljava/lang/CharSequence;)V

    :cond_3
    invoke-static {}, Lnet/youmi/android/offers/OffersManager;->isUsingServerCallBack()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {}, Lnet/youmi/android/a/a/j/a/b;->a()Lnet/youmi/android/a/a/j/a/b;

    move-result-object v0

    const/16 v4, 0x8

    invoke-virtual {v0, v4}, Lnet/youmi/android/a/a/j/a/b;->c(I)V

    :cond_4
    :goto_4
    const-string v0, "ad"

    const/4 v4, 0x0

    invoke-static {v5, v0, v4}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONArray;)Lorg/json/JSONArray;

    move-result-object v4

    if-nez v4, :cond_7

    const-string v0, "can\'t get data of Ad! error key : ad"

    invoke-static {v0}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-direct {p0, v2, v3}, Lnet/youmi/android/offers/c/b/a;->a(ILjava/lang/String;)V

    goto :goto_1

    :cond_5
    move v0, v1

    goto :goto_3

    :cond_6
    :try_start_4
    invoke-static {}, Lnet/youmi/android/a/a/j/a/b;->a()Lnet/youmi/android/a/a/j/a/b;

    move-result-object v0

    const/4 v6, 0x0

    invoke-virtual {v0, v6}, Lnet/youmi/android/a/a/j/a/b;->c(I)V

    sget-boolean v0, Lnet/youmi/android/offers/OffersBrowserConfig;->isUsingSdkPointsUnitApi:Z

    if-nez v0, :cond_4

    invoke-static {v4}, Lnet/youmi/android/offers/OffersBrowserConfig;->setPointsUnit(Ljava/lang/String;)V
    :try_end_4
    .catch Ljava/lang/Throwable; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    :catch_0
    move-exception v0

    :goto_5
    invoke-direct {p0, v2, v3}, Lnet/youmi/android/offers/c/b/a;->a(ILjava/lang/String;)V

    goto/16 :goto_1

    :cond_7
    :try_start_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/offers/c/b/a;->l:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/offers/c/b/a;->m:Ljava/util/List;

    move v0, v2

    :goto_6
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I
    :try_end_5
    .catch Ljava/lang/Throwable; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move-result v5

    if-ge v0, v5, :cond_b

    :try_start_6
    invoke-virtual {v4, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "wadid"

    const/4 v7, 0x0

    invoke-static {v5, v6, v7}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v6

    const-string v7, "pn"

    const/4 v8, 0x0

    invoke-static {v5, v7, v8}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "name"

    const/4 v9, 0x0

    invoke-static {v5, v8, v9}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v7, :cond_9

    const-string v5, "ad id : %d has some problem, please contact us."

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v7, v8

    invoke-static {v5, v7}, Lnet/youmi/android/a/c/b/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_8
    :goto_7
    add-int/lit8 v0, v0, 0x1

    goto :goto_6

    :cond_9
    invoke-static {v7}, Lnet/youmi/android/a/b/d/g;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "isr"

    const/4 v11, 0x0

    invoke-static {v5, v10, v11}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v10

    const-string v11, "er"

    const/4 v12, 0x0

    invoke-static {v5, v11, v12}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v11

    const-string v12, "at"

    const/4 v13, 0x0

    invoke-static {v5, v12, v13}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v12

    new-instance v13, Lnet/youmi/android/a/a/g/a/b/a;

    invoke-direct {v13}, Lnet/youmi/android/a/a/g/a/b/a;-><init>()V

    invoke-virtual {v13, v9}, Lnet/youmi/android/a/a/g/a/b/a;->a(Ljava/lang/String;)V

    invoke-virtual {v13, v6}, Lnet/youmi/android/a/a/g/a/b/a;->a(I)V

    invoke-virtual {v13, v10}, Lnet/youmi/android/a/a/g/a/b/a;->b(I)V

    invoke-virtual {v13, v11}, Lnet/youmi/android/a/a/g/a/b/a;->c(I)V

    invoke-virtual {v13, v12}, Lnet/youmi/android/a/a/g/a/b/a;->d(I)V

    invoke-virtual {v13, v8}, Lnet/youmi/android/a/a/g/a/b/a;->b(Ljava/lang/String;)V

    iget-object v6, p0, Lnet/youmi/android/offers/c/b/a;->l:Ljava/util/List;

    invoke-interface {v6, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v6, p0, Lnet/youmi/android/offers/c/b/a;->m:Ljava/util/List;

    invoke-interface {v6, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v6, "urlt"

    const/4 v8, 0x0

    invoke-static {v5, v6, v8}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;I)I

    move-result v6

    if-ne v6, v1, :cond_8

    const-string v6, "url"

    const/4 v8, 0x0

    invoke-static {v5, v6, v8}, Lnet/youmi/android/a/b/b/b;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lnet/youmi/android/a/b/b/e;->a(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_8

    iget-object v5, p0, Lnet/youmi/android/offers/c/b/a;->n:Ljava/util/List;

    if-nez v5, :cond_a

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, p0, Lnet/youmi/android/offers/c/b/a;->n:Ljava/util/List;

    :cond_a
    iget-object v5, p0, Lnet/youmi/android/offers/c/b/a;->n:Ljava/util/List;

    invoke-interface {v5, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/Throwable; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_7

    :catch_1
    move-exception v5

    goto :goto_7

    :cond_b
    :try_start_7
    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->l:Ljava/util/List;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lnet/youmi/android/offers/c/b/a;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I
    :try_end_7
    .catch Ljava/lang/Throwable; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    move-result v0

    if-gtz v0, :cond_d

    :cond_c
    invoke-direct {p0, v2, v3}, Lnet/youmi/android/offers/c/b/a;->a(ILjava/lang/String;)V

    goto/16 :goto_1

    :cond_d
    :try_start_8
    invoke-direct {p0}, Lnet/youmi/android/offers/c/b/a;->c()V

    invoke-direct {p0}, Lnet/youmi/android/offers/c/b/a;->d()Z

    invoke-direct {p0}, Lnet/youmi/android/offers/c/b/a;->e()V

    invoke-direct {p0}, Lnet/youmi/android/offers/c/b/a;->f()Ljava/lang/String;
    :try_end_8
    .catch Ljava/lang/Throwable; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-result-object v0

    move-object v1, v0

    move v0, v2

    goto/16 :goto_0

    :catchall_0
    move-exception v1

    move v2, v0

    move-object v0, v1

    :goto_8
    invoke-direct {p0, v2, v3}, Lnet/youmi/android/offers/c/b/a;->a(ILjava/lang/String;)V

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_8

    :catch_2
    move-exception v1

    move v2, v0

    goto/16 :goto_5

    :cond_e
    move-object v4, v0

    goto/16 :goto_2
.end method
