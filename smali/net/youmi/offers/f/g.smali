.class Lnet/youmi/android/offers/f/g;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lnet/youmi/android/offers/f/e;


# direct methods
.method constructor <init>(Lnet/youmi/android/offers/f/e;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/offers/f/g;->b:Lnet/youmi/android/offers/f/e;

    iput-object p2, p0, Lnet/youmi/android/offers/f/g;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Lnet/youmi/android/a/a/j/c/b;

    invoke-static {}, Lnet/youmi/android/offers/f/e;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/youmi/android/a/a/j/c/b;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lnet/youmi/android/offers/f/g;->a:Ljava/lang/String;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lnet/youmi/android/a/a/j/c/b;->a(Ljava/lang/String;I)V

    return-void
.end method
