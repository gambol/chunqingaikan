.class public Lnet/youmi/android/a/b/f/h;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/b/f/g;

.field private b:I

.field private c:I

.field private d:[I

.field private e:Ljava/util/Random;


# direct methods
.method public constructor <init>(Lnet/youmi/android/a/b/f/g;)V
    .locals 1

    iput-object p1, p0, Lnet/youmi/android/a/b/f/h;->a:Lnet/youmi/android/a/b/f/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lnet/youmi/android/a/b/f/h;->e:Ljava/util/Random;

    const/4 v0, 0x4

    new-array v0, v0, [I

    iput-object v0, p0, Lnet/youmi/android/a/b/f/h;->d:[I

    const/4 v0, 0x0

    iput v0, p0, Lnet/youmi/android/a/b/f/h;->c:I

    const/4 v0, -0x1

    iput v0, p0, Lnet/youmi/android/a/b/f/h;->b:I

    return-void
.end method

.method public constructor <init>(Lnet/youmi/android/a/b/f/g;I)V
    .locals 0

    invoke-direct {p0, p1}, Lnet/youmi/android/a/b/f/h;-><init>(Lnet/youmi/android/a/b/f/g;)V

    iput p2, p0, Lnet/youmi/android/a/b/f/h;->b:I

    return-void
.end method

.method constructor <init>(Lnet/youmi/android/a/b/f/g;Lnet/youmi/android/a/b/f/e;)V
    .locals 3

    invoke-virtual {p2}, Lnet/youmi/android/a/b/f/e;->f()I

    move-result v0

    invoke-direct {p0, p1, v0}, Lnet/youmi/android/a/b/f/h;-><init>(Lnet/youmi/android/a/b/f/g;I)V

    invoke-virtual {p2}, Lnet/youmi/android/a/b/f/e;->f()I

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/b/f/h;->c:I

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lnet/youmi/android/a/b/f/h;->d:[I

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/a/b/f/h;->d:[I

    invoke-virtual {p2}, Lnet/youmi/android/a/b/f/e;->f()I

    move-result v2

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    iget v0, p0, Lnet/youmi/android/a/b/f/h;->b:I

    if-ltz v0, :cond_0

    iget v0, p0, Lnet/youmi/android/a/b/f/h;->b:I

    :goto_0
    return v0

    :cond_0
    monitor-enter p0

    :try_start_0
    iget v0, p0, Lnet/youmi/android/a/b/f/h;->b:I

    if-gez v0, :cond_1

    iget-object v0, p0, Lnet/youmi/android/a/b/f/h;->e:Ljava/util/Random;

    const v1, 0xffff

    invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    iput v0, p0, Lnet/youmi/android/a/b/f/h;->b:I

    :cond_1
    iget v0, p0, Lnet/youmi/android/a/b/f/h;->b:I

    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(I)I
    .locals 1

    iget-object v0, p0, Lnet/youmi/android/a/b/f/h;->d:[I

    aget v0, v0, p1

    return v0
.end method

.method a(Lnet/youmi/android/a/b/f/f;)V
    .locals 2

    invoke-virtual {p0}, Lnet/youmi/android/a/b/f/h;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Lnet/youmi/android/a/b/f/f;->b(I)V

    const/16 v0, 0x100

    invoke-virtual {p1, v0}, Lnet/youmi/android/a/b/f/f;->b(I)V

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lnet/youmi/android/a/b/f/h;->d:[I

    array-length v1, v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lnet/youmi/android/a/b/f/h;->d:[I

    aget v1, v1, v0

    invoke-virtual {p1, v1}, Lnet/youmi/android/a/b/f/f;->b(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method b(I)V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/b/f/h;->d:[I

    aget v0, v0, p1

    const v1, 0xffff

    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DNS section count cannot be incremented"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lnet/youmi/android/a/b/f/h;->d:[I

    aget v1, v0, p1

    add-int/lit8 v1, v1, 0x1

    aput v1, v0, p1

    return-void
.end method

.method public clone()Ljava/lang/Object;
    .locals 5

    const/4 v4, 0x0

    new-instance v0, Lnet/youmi/android/a/b/f/h;

    iget-object v1, p0, Lnet/youmi/android/a/b/f/h;->a:Lnet/youmi/android/a/b/f/g;

    invoke-direct {v0, v1}, Lnet/youmi/android/a/b/f/h;-><init>(Lnet/youmi/android/a/b/f/g;)V

    iget v1, p0, Lnet/youmi/android/a/b/f/h;->b:I

    iput v1, v0, Lnet/youmi/android/a/b/f/h;->b:I

    iget v1, p0, Lnet/youmi/android/a/b/f/h;->c:I

    iput v1, v0, Lnet/youmi/android/a/b/f/h;->c:I

    iget-object v1, p0, Lnet/youmi/android/a/b/f/h;->d:[I

    iget-object v2, v0, Lnet/youmi/android/a/b/f/h;->d:[I

    iget-object v3, p0, Lnet/youmi/android/a/b/f/h;->d:[I

    array-length v3, v3

    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method
