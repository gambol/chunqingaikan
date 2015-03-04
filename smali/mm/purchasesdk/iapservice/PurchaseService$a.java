package mm.purchasesdk.iapservice; class PurchaseService$a { void a() { int a;
a=0;// .class Lmm/purchasesdk/iapservice/PurchaseService$a;
a=0;// .super Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "a"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lmm/purchasesdk/iapservice/PurchaseService;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lmm/purchasesdk/iapservice/PurchaseService$a;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a(Lmm/purchasesdk/core/protocol/MessengerInfo;I)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getIDToken()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq p2, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTimeStamp()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, ""
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getResult()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Lmm/purchasesdk/fingerprint/IdentifyApp;->IdTokenService([BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setIdtoken_verf(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "sendToClient Server "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0, p2, v4, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->a()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTaskID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-static {v2, v0}, Lmm/purchasesdk/iapservice/PurchaseService;->b(Lmm/purchasesdk/iapservice/PurchaseService;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->writeToBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/iapservice/PurchaseService;->b(Lmm/purchasesdk/iapservice/PurchaseService;)Landroid/os/Messenger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/iapservice/PurchaseService;->a(Lmm/purchasesdk/iapservice/PurchaseService;)Landroid/os/Messenger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/iapservice/PurchaseService;->a(Lmm/purchasesdk/iapservice/PurchaseService;)Landroid/os/Messenger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;// 
a=0;//     :cond_1
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->a()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->a()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTaskID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "handleMessage what:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ":"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/iapservice/PurchaseService;->a(Lmm/purchasesdk/iapservice/PurchaseService;)Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, p1}, Lmm/purchasesdk/core/IPurchase;->setMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/iapservice/PurchaseService;->a(Lmm/purchasesdk/iapservice/PurchaseService;)Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lmm/purchasesdk/core/IPurchase;->setMessenger(Landroid/os/Messenger;)V
a=0;// 
a=0;//     new-instance v1, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     #v1=(UninitRef,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-direct {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->readBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     invoke-static {v2}, Lmm/purchasesdk/iapservice/PurchaseService;->a(Lmm/purchasesdk/iapservice/PurchaseService;)Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getClasseSha1()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v3}, Lmm/purchasesdk/core/IPurchase;->setClasseSha1(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v2, "PAYCODE"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     const-string v2, "TIMESTAMP"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "info.getTaskID() = "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTaskID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->a()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTaskID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Reference,Ujava/lang/Object;);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Null);
a=0;//     iget v0, p1, Landroid/os/Message;->arg2:I
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/iapservice/PurchaseService;);
a=0;//     iget-object v2, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Messenger;);
a=0;//     invoke-static {v0, v2}, Lmm/purchasesdk/iapservice/PurchaseService;->a(Lmm/purchasesdk/iapservice/PurchaseService;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, " IncomingHandler info.getTaskID() = "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTaskID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v2}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->b()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTaskID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v2=(Conflicted);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/iapservice/PurchaseService;);
a=0;//     invoke-static {v0, p1, v1}, Lmm/purchasesdk/iapservice/PurchaseService;->a(Lmm/purchasesdk/iapservice/PurchaseService;Landroid/os/Message;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/iapservice/PurchaseService;);
a=0;//     invoke-static {v0, p1, v1}, Lmm/purchasesdk/iapservice/PurchaseService;->b(Lmm/purchasesdk/iapservice/PurchaseService;Landroid/os/Message;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v1, v0}, Lmm/purchasesdk/iapservice/PurchaseService$a;->a(Lmm/purchasesdk/core/protocol/MessengerInfo;I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/iapservice/PurchaseService;);
a=0;//     invoke-static {v0, p1, v1}, Lmm/purchasesdk/iapservice/PurchaseService;->c(Lmm/purchasesdk/iapservice/PurchaseService;Landroid/os/Message;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/iapservice/PurchaseService;);
a=0;//     invoke-static {v0, p1, v1}, Lmm/purchasesdk/iapservice/PurchaseService;->d(Lmm/purchasesdk/iapservice/PurchaseService;Landroid/os/Message;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/iapservice/PurchaseService;);
a=0;//     invoke-static {v0, p1, v1}, Lmm/purchasesdk/iapservice/PurchaseService;->e(Lmm/purchasesdk/iapservice/PurchaseService;Landroid/os/Message;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :pswitch_7
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {v5, v0, v4, v4}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Reference,Landroid/os/Message;);
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "MSG_BILLFINISH info = "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "MSG_BILLFINISH info.getTaskID() = "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTaskID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v3, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->a()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTaskID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-static {v3, v0}, Lmm/purchasesdk/iapservice/PurchaseService;->b(Lmm/purchasesdk/iapservice/PurchaseService;Landroid/os/Messenger;)Landroid/os/Messenger;
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->d()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "MSG_BILLFINISH mMessengerFC = "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     invoke-static {v4}, Lmm/purchasesdk/iapservice/PurchaseService;->a(Lmm/purchasesdk/iapservice/PurchaseService;)Landroid/os/Messenger;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v0, v3}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->writeToBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/iapservice/PurchaseService;->b(Lmm/purchasesdk/iapservice/PurchaseService;)Landroid/os/Messenger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, v2, Landroid/os/Message;->replyTo:Landroid/os/Messenger;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/iapservice/PurchaseService;->a(Lmm/purchasesdk/iapservice/PurchaseService;)Landroid/os/Messenger;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->a()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getTaskID()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);
a=0;//     invoke-static {}, Lmm/purchasesdk/iapservice/PurchaseService;->a()Ljava/util/HashMap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/iapservice/PurchaseService;);
a=0;//     invoke-static {v0, v5}, Lmm/purchasesdk/iapservice/PurchaseService;->a(Lmm/purchasesdk/iapservice/PurchaseService;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     invoke-virtual {v0}, Landroid/os/RemoteException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :pswitch_8
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Reference,Ujava/lang/Object;);v4=(Null);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/iapservice/PurchaseService;);
a=0;//     invoke-static {v0}, Lmm/purchasesdk/iapservice/PurchaseService;->a(Lmm/purchasesdk/iapservice/PurchaseService;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPackageName(Ljava/lang/String;)V
a=0;// 
a=0;//     const/16 v0, 0x9
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-direct {p0, v1, v0}, Lmm/purchasesdk/iapservice/PurchaseService$a;->a(Lmm/purchasesdk/core/protocol/MessengerInfo;I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_9
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/iapservice/PurchaseService$a;->a:Lmm/purchasesdk/iapservice/PurchaseService;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/iapservice/PurchaseService;);
a=0;//     invoke-static {v0, p1, v1}, Lmm/purchasesdk/iapservice/PurchaseService;->f(Lmm/purchasesdk/iapservice/PurchaseService;Landroid/os/Message;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_4
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//         :pswitch_3
a=0;//         :pswitch_7
a=0;//         :pswitch_0
a=0;//         :pswitch_8
a=0;//         :pswitch_0
a=0;//         :pswitch_9
a=0;//     .end packed-switch
a=0;// .end method
}}
