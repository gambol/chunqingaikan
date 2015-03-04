package cn.waps; class cd { void a() { int a;
a=0;// .class Lcn/waps/cd;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field final synthetic b:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field final synthetic c:Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;// .field final synthetic d:Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;// .field final synthetic e:Landroid/content/Context;
a=0;// 
a=0;// .field final synthetic f:Landroid/app/Dialog;
a=0;// 
a=0;// .field final synthetic g:I
a=0;// 
a=0;// .field final synthetic h:I
a=0;// 
a=0;// .field final synthetic i:Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;// .field final synthetic j:Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;// .field final synthetic k:Lcn/waps/bw;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/waps/bw;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/view/animation/TranslateAnimation;Landroid/view/animation/TranslateAnimation;Landroid/content/Context;Landroid/app/Dialog;IILandroid/view/animation/TranslateAnimation;Landroid/view/animation/TranslateAnimation;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     iput-object p2, p0, Lcn/waps/cd;->a:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object p3, p0, Lcn/waps/cd;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object p4, p0, Lcn/waps/cd;->c:Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     iput-object p5, p0, Lcn/waps/cd;->d:Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     iput-object p6, p0, Lcn/waps/cd;->e:Landroid/content/Context;
a=0;// 
a=0;//     iput-object p7, p0, Lcn/waps/cd;->f:Landroid/app/Dialog;
a=0;// 
a=0;//     iput p8, p0, Lcn/waps/cd;->g:I
a=0;// 
a=0;//     iput p9, p0, Lcn/waps/cd;->h:I
a=0;// 
a=0;//     iput-object p10, p0, Lcn/waps/cd;->i:Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     iput-object p11, p0, Lcn/waps/cd;->j:Landroid/view/animation/TranslateAnimation;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/cd;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// 
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     iget-object v0, p0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bw;);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, v0, Lcn/waps/bw;->c:F
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(PosByte);
a=0;//     iget-object v0, p0, Lcn/waps/cd;->a:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cd;->b:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/bw;);
a=0;//     invoke-static {v0}, Lcn/waps/bw;->a(Lcn/waps/bw;)Landroid/widget/ViewFlipper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     iget-object v0, v0, Lcn/waps/bw;->e:Ljava/util/List;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     sget-object v0, Lcn/waps/bw;->b:Ljava/util/List;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lcn/waps/cd;->k:Lcn/waps/bw;
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, v0, Lcn/waps/bw;->d:F
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/bw;->b()Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-static {}, Lcn/waps/bw;->b()Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     new-instance v1, Lcn/waps/ce;
a=0;// 
a=0;//     #v1=(UninitRef,Lcn/waps/ce;);
a=0;//     invoke-direct {v1, p0}, Lcn/waps/ce;-><init>(Lcn/waps/cd;)V
a=0;// 
a=0;//     #v1=(Reference,Lcn/waps/ce;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_3
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
