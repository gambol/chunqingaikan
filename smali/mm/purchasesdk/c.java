package mm.purchasesdk; class c { void a() { int a;
a=0;// .class Lmm/purchasesdk/c;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/ServiceConnection;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lmm/purchasesdk/Purchase;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/c;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lmm/purchasesdk/c;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
a=0;//     .locals 6
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "onServiceConnected method. ComponentName"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " service:"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/c;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/Purchase;->access$802(Lmm/purchasesdk/Purchase;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/c;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     new-instance v1, Landroid/os/Messenger;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Messenger;);
a=0;//     invoke-direct {v1, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Messenger;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/Purchase;->access$802(Lmm/purchasesdk/Purchase;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/c;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     new-instance v1, Landroid/os/Messenger;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/os/Messenger;);
a=0;//     new-instance v2, Lmm/purchasesdk/sdk/g;
a=0;// 
a=0;//     #v2=(UninitRef,Lmm/purchasesdk/sdk/g;);
a=0;//     iget-object v3, p0, Lmm/purchasesdk/c;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v3=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     invoke-static {v3}, Lmm/purchasesdk/Purchase;->access$200(Lmm/purchasesdk/Purchase;)Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/c;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v4=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     invoke-static {v4}, Lmm/purchasesdk/Purchase;->access$1100(Lmm/purchasesdk/Purchase;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p0, Lmm/purchasesdk/c;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v5=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     iget-object v5, v5, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v2, v3, v4, v5}, Lmm/purchasesdk/sdk/g;-><init>(Lmm/purchasesdk/OnPurchaseListener;Landroid/os/Handler;Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Lmm/purchasesdk/sdk/g;);
a=0;//     invoke-direct {v1, v2}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Messenger;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/Purchase;->access$1002(Lmm/purchasesdk/Purchase;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/c;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/Purchase;->access$902(Lmm/purchasesdk/Purchase;Ljava/lang/Boolean;)Ljava/lang/Boolean;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/c;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/Purchase;->queryPackageName()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onServiceDisconnected(Landroid/content/ComponentName;)V
a=0;//     .locals 2
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/c;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/Purchase;->access$802(Lmm/purchasesdk/Purchase;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/c;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Boolean;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/Purchase;->access$902(Lmm/purchasesdk/Purchase;Ljava/lang/Boolean;)Ljava/lang/Boolean;
a=0;// 
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     const-string v1, "Service disconnected!!"
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
