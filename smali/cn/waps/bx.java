package cn.waps; class bx { void a() { int a;
a=0;// .class Lcn/waps/bx;
a=0;// .super Landroid/os/Handler;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/waps/bw;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/bw;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/bx;->a:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/bx;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 9
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v1, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/bx;->a:Lcn/waps/bw;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/bw;);
a=0;//     invoke-static {v1}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Reference,Landroid/widget/ViewFlipper;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v1, p0, Lcn/waps/bx;->a:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/ViewFlipper;->showNext()V
a=0;// 
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/bx;->a:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/ViewFlipper;->isShown()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, [Ljava/lang/Object;
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     check-cast v0, [Ljava/lang/Object;
a=0;// 
a=0;//     move-object v7, v0
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aget-object v3, v7, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     check-cast v3, Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aget-object v4, v7, v1
a=0;// 
a=0;//     #v4=(Null);
a=0;//     check-cast v4, Landroid/app/Dialog;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Dialog;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aget-object v1, v7, v1
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     aget-object v1, v7, v1
a=0;// 
a=0;//     #v1=(Null);
a=0;//     check-cast v1, Ljava/lang/Integer;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Integer;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget-object v1, p0, Lcn/waps/bx;->a:Lcn/waps/bw;
a=0;// 
a=0;//     sget-object v2, Lcn/waps/bw;->b:Ljava/util/List;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/List;);
a=0;//     invoke-static {v1, v3, v2}, Lcn/waps/bw;->a(Lcn/waps/bw;Landroid/content/Context;Ljava/util/List;)Lcn/waps/AdInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/bx;->a:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v1}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/ViewFlipper;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sget-object v8, Lcn/waps/bw;->b:Ljava/util/List;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v8}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ge v1, v8, :cond_2
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Lcn/waps/bx;->a:Lcn/waps/bw;
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/bw;);
a=0;//     invoke-static/range {v1 .. v6}, Lcn/waps/bw;->a(Lcn/waps/bw;Lcn/waps/AdInfo;Landroid/content/Context;Landroid/app/Dialog;II)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v3, p0, Lcn/waps/bx;->a:Lcn/waps/bw;
a=0;// 
a=0;//     iget-object v4, p0, Lcn/waps/bx;->a:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-static {v4}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v3, v2, v4, v1}, Lcn/waps/bw;->a(Lcn/waps/bw;Lcn/waps/AdInfo;Landroid/widget/ViewFlipper;Landroid/widget/LinearLayout;)V
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1}, Lcn/waps/bx;->obtainMessage(I)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     iput-object v7, v1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/waps/AdInfo;->m()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x3e8
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {p0, v1, v2, v3}, Lcn/waps/bx;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
}}
