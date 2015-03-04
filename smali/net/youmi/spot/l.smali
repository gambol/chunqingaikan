.class Lnet/youmi/android/spot/l;
.super Landroid/content/BroadcastReceiver;


# instance fields
.field final synthetic a:Lnet/youmi/android/spot/SpotManager;


# direct methods
.method constructor <init>(Lnet/youmi/android/spot/SpotManager;)V
    .locals 0

    iput-object p1, p0, Lnet/youmi/android/spot/l;->a:Lnet/youmi/android/spot/SpotManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "android.intent.action.SCREEN_ON"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lnet/youmi/android/spot/l;->a:Lnet/youmi/android/spot/SpotManager;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lnet/youmi/android/spot/SpotManager;->a(Lnet/youmi/android/spot/SpotManager;Z)Z

    :cond_0
    :goto_0
    return-void

    :cond_1
    const-string v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnet/youmi/android/spot/l;->a:Lnet/youmi/android/spot/SpotManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lnet/youmi/android/spot/SpotManager;->a(Lnet/youmi/android/spot/SpotManager;Z)Z

    goto :goto_0
.end method
