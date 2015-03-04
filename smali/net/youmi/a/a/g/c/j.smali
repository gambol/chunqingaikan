.class Lnet/youmi/android/a/a/g/c/j;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lnet/youmi/android/a/a/g/c/i;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/g/c/i;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/g/c/j;->c:Lnet/youmi/android/a/a/g/c/i;

    iput-object p2, p0, Lnet/youmi/android/a/a/g/c/j;->a:Ljava/lang/String;

    iput p3, p0, Lnet/youmi/android/a/a/g/c/j;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    new-instance v0, Lnet/youmi/android/a/a/j/c/b;

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/j;->c:Lnet/youmi/android/a/a/g/c/i;

    invoke-static {v1}, Lnet/youmi/android/a/a/g/c/i;->a(Lnet/youmi/android/a/a/g/c/i;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/youmi/android/a/a/j/c/b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lnet/youmi/android/a/a/g/c/j;->a:Ljava/lang/String;

    const/4 v2, 0x1

    iget v3, p0, Lnet/youmi/android/a/a/g/c/j;->b:I

    invoke-virtual {v0, v1, v2, v3}, Lnet/youmi/android/a/a/j/c/b;->a(Ljava/lang/String;II)V

    return-void
.end method
