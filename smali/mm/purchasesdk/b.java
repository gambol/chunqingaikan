package mm.purchasesdk; class b { void a() { int a;
a=0;// .class Lmm/purchasesdk/b;
a=0;// .super Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/os/Bundle;
a=0;// 
a=0;// .field final synthetic a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lmm/purchasesdk/Purchase;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lmm/purchasesdk/b;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 7
a=0;// 
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v0, p0, Lmm/purchasesdk/b;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/Purchase;->access$000(Lmm/purchasesdk/Purchase;)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/b;->a:Landroid/os/Bundle;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->readBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-static {v1, v0}, Lmm/purchasesdk/Purchase;->access$002(Lmm/purchasesdk/Purchase;Lmm/purchasesdk/core/protocol/MessengerInfo;)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     move-object v5, v0
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v5}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getDyQuestion()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v5}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getDyQuestion()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/Purchase;->access$100()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/core/IPurchase;);
a=0;//     invoke-interface {v0}, Lmm/purchasesdk/core/IPurchase;->getDyAnswer()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/Purchase;->access$100()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v1}, Lmm/purchasesdk/core/IPurchase;->getStatus()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v5, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setMarkStatus(I)V
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v5, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setDyAnswer(Ljava/lang/String;)V
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {v5}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPurchasecode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x11e
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     :try_start_0
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "enter qiang zhuan ruo order"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     iget-object v1, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     iget-object v1, v1, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v5}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPaycode()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getOrderCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v5}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getUserData()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5}, Lmm/purchasesdk/core/protocol/MessengerInfo;->ismNextCycle()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     iget-object v6, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v6=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     invoke-static {v6}, Lmm/purchasesdk/Purchase;->access$200(Lmm/purchasesdk/Purchase;)Lmm/purchasesdk/OnPurchaseListener;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static/range {v0 .. v6}, Lmm/purchasesdk/Purchase;->access$300(Lmm/purchasesdk/Purchase;Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;ZLmm/purchasesdk/OnPurchaseListener;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     sget-object v1, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "qiang zhuan ruo order fail"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lmm/purchasesdk/core/utils/LogUtil;->d(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);v6=(Uninit);
a=0;//     const/16 v0, 0x190
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     invoke-virtual {v5, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPurchasecode(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(PosShort);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     invoke-static {v0, v5}, Lmm/purchasesdk/Purchase;->access$400(Lmm/purchasesdk/Purchase;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Uninit);v5=(Uninit);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/Purchase;->unBind()V
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/Purchase;->access$100()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lmm/purchasesdk/core/IPurchase;->resetParams1()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/Purchase;->unBind()V
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/Purchase;->access$100()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lmm/purchasesdk/core/IPurchase;->resetParams1()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/Purchase;->unBind()V
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/Purchase;->access$100()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lmm/purchasesdk/core/IPurchase;->resetParams1()V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/Purchase;->access$000(Lmm/purchasesdk/Purchase;)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->reset()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/Purchase;->unBind()V
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/Purchase;->access$100()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lmm/purchasesdk/core/IPurchase;->resetParams1()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_6
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     iget-object v1, v0, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :pswitch_7
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     invoke-static {v0}, Lmm/purchasesdk/Purchase;->access$000(Lmm/purchasesdk/Purchase;)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Lmm/purchasesdk/core/protocol/MessengerInfo;);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     check-cast v0, Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->writeToBundle()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->readBundle(Landroid/os/Bundle;)V
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/Purchase;->access$000(Lmm/purchasesdk/Purchase;)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/Purchase;->access$000(Lmm/purchasesdk/Purchase;)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     invoke-static {}, Lmm/purchasesdk/Purchase;->access$100()Lmm/purchasesdk/core/IPurchase;
a=0;// 
a=0;//     const/16 v1, 0x9
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Lmm/purchasesdk/Purchase;->access$500(Lmm/purchasesdk/Purchase;I)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/Purchase;->access$000(Lmm/purchasesdk/Purchase;)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {}, Lmm/purchasesdk/Purchase;->access$600()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Lmm/purchasesdk/core/protocol/MessengerInfo;->setPackageName(Ljava/lang/String;)V
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);
a=0;//     new-instance v0, Lmm/purchasesdk/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lmm/purchasesdk/a;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     #v2=(Reference,Lmm/purchasesdk/Purchase;);
a=0;//     invoke-static {v2}, Lmm/purchasesdk/Purchase;->access$000(Lmm/purchasesdk/Purchase;)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v1, v2}, Lmm/purchasesdk/a;-><init>(Lmm/purchasesdk/Purchase;Lmm/purchasesdk/core/protocol/MessengerInfo;)V
a=0;// 
a=0;//     #v0=(Reference,Lmm/purchasesdk/a;);
a=0;//     iget-object v1, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     iget-object v1, v1, Lmm/purchasesdk/Purchase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-static {v2}, Lmm/purchasesdk/Purchase;->access$700(Lmm/purchasesdk/Purchase;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Lmm/purchasesdk/a;->a(Landroid/content/Context;I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Integer);v2=(Uninit);
a=0;//     sget-object v0, Lmm/purchasesdk/Purchase;->TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "handlemessage get packagename:"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-static {v2}, Lmm/purchasesdk/Purchase;->access$000(Lmm/purchasesdk/Purchase;)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "and set to mPackageName"
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
a=0;//     iget-object v0, p0, Lmm/purchasesdk/b;->a:Lmm/purchasesdk/Purchase;
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/Purchase;->access$000(Lmm/purchasesdk/Purchase;)Lmm/purchasesdk/core/protocol/MessengerInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lmm/purchasesdk/core/protocol/MessengerInfo;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lmm/purchasesdk/Purchase;->access$602(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//         :pswitch_1
a=0;//         :pswitch_5
a=0;//         :pswitch_0
a=0;//         :pswitch_4
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_6
a=0;//         :pswitch_7
a=0;//     .end packed-switch
a=0;// .end method
}}
