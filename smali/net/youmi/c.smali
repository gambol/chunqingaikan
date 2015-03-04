.class Lnet/youmi/android/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lnet/youmi/android/ExpService;


# direct methods
.method constructor <init>(Lnet/youmi/android/ExpService;Landroid/content/Context;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/c;->c:Lnet/youmi/android/ExpService;

    iput-object p2, p0, Lnet/youmi/android/c;->a:Landroid/content/Context;

    iput-object p3, p0, Lnet/youmi/android/c;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    new-instance v0, Lnet/youmi/android/a/a/j/c/a;

    iget-object v1, p0, Lnet/youmi/android/c;->a:Landroid/content/Context;

    invoke-direct {v0, v1}, Lnet/youmi/android/a/a/j/c/a;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lnet/youmi/android/a/a/h/a;->G()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2}, Lnet/youmi/android/a/a/j/c/a;->a(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method
