.class final Lnet/youmi/android/offers/f/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/offers/f/c;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lnet/youmi/android/offers/f/c;->a:Landroid/content/Context;

    iget-object v1, p0, Lnet/youmi/android/offers/f/c;->a:Landroid/content/Context;

    invoke-static {v1}, Lnet/youmi/android/offers/f/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lnet/youmi/android/offers/f/a/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lnet/youmi/android/offers/f/c;->a:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-static {v1, v0, v2}, Lnet/youmi/android/offers/f/b;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method
