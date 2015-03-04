.class Lnet/youmi/android/a/a/j/a/f;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Ljava/lang/CharSequence;

.field final synthetic c:Lnet/youmi/android/a/a/j/a/b;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/j/a/b;Ljava/util/List;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/j/a/f;->c:Lnet/youmi/android/a/a/j/a/b;

    iput-object p2, p0, Lnet/youmi/android/a/a/j/a/f;->a:Ljava/util/List;

    iput-object p3, p0, Lnet/youmi/android/a/a/j/a/f;->b:Ljava/lang/CharSequence;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/a/f;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lnet/youmi/android/a/a/j/a/f;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnet/youmi/android/a/a/j/a/a;

    iget-object v2, p0, Lnet/youmi/android/a/a/j/a/f;->b:Ljava/lang/CharSequence;

    invoke-interface {v0, v2}, Lnet/youmi/android/a/a/j/a/a;->b(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_1
.end method
