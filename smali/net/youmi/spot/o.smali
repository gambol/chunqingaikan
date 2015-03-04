.class Lnet/youmi/android/spot/o;
.super Ljava/lang/Thread;


# instance fields
.field final synthetic a:Lnet/youmi/android/spot/SpotManager;


# direct methods
.method constructor <init>(Lnet/youmi/android/spot/SpotManager;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/spot/o;->a:Lnet/youmi/android/spot/SpotManager;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lnet/youmi/android/spot/o;->a:Lnet/youmi/android/spot/SpotManager;

    iget-object v1, p0, Lnet/youmi/android/spot/o;->a:Lnet/youmi/android/spot/SpotManager;

    invoke-static {v1}, Lnet/youmi/android/spot/SpotManager;->a(Lnet/youmi/android/spot/SpotManager;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lnet/youmi/android/spot/o;->a:Lnet/youmi/android/spot/SpotManager;

    iget-object v2, v2, Lnet/youmi/android/spot/SpotManager;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lnet/youmi/android/spot/SpotManager;->a(Landroid/content/Context;Ljava/lang/String;)Z

    return-void
.end method
