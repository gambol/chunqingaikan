.class Lnet/youmi/android/a/a/g/c/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lnet/youmi/android/a/b/g/d/a;

.field final synthetic b:I

.field final synthetic c:Lnet/youmi/android/a/a/g/c/a;


# direct methods
.method constructor <init>(Lnet/youmi/android/a/a/g/c/a;Lnet/youmi/android/a/b/g/d/a;I)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/a/a/g/c/b;->c:Lnet/youmi/android/a/a/g/c/a;

    iput-object p2, p0, Lnet/youmi/android/a/a/g/c/b;->a:Lnet/youmi/android/a/b/g/d/a;

    iput p3, p0, Lnet/youmi/android/a/a/g/c/b;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lnet/youmi/android/a/a/g/c/b;->a:Lnet/youmi/android/a/b/g/d/a;

    iget v1, p0, Lnet/youmi/android/a/a/g/c/b;->b:I

    invoke-interface {v0, v1}, Lnet/youmi/android/a/b/g/d/a;->a(I)V

    return-void
.end method
