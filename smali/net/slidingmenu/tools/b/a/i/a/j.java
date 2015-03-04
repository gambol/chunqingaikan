package net.slidingmenu.tools.b.a.i.a; class j { void a() { int a;
a=0;// .class Lnet/slidingmenu/tools/b/a/i/a/j;
a=0;// .super Landroid/widget/RelativeLayout;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Landroid/widget/TextView;
a=0;// 
a=0;// .field private b:Landroid/widget/Button;
a=0;// 
a=0;// .field private c:Landroid/widget/Button;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 6
a=0;// 
a=0;//     const/4 v5, -0x2
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Lnet/slidingmenu/tools/b/a/i/a/j;);
a=0;//     new-instance v0, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     new-instance v1, Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/j;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v1, p0, Lnet/slidingmenu/tools/b/a/i/a/j;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     const/high16 v2, -0x1000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-static {p1}, Lnet/slidingmenu/tools/b/b/k/f;->a(Landroid/content/Context;)Lnet/slidingmenu/tools/b/b/k/f;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Lnet/slidingmenu/tools/b/b/k/f;);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Lnet/slidingmenu/tools/b/b/k/f;->a(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v2, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     const/16 v3, 0x11
a=0;// 
a=0;//     iput v3, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     iget-object v3, p0, Lnet/slidingmenu/tools/b/a/i/a/j;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, v3, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-virtual {p0, v3}, Lnet/slidingmenu/tools/b/a/i/a/j;->setBackgroundColor(I)V
a=0;// 
a=0;//     new-instance v3, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-direct {v3, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v3, v2, v2, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V
a=0;// 
a=0;//     new-instance v2, Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/Button;);
a=0;//     invoke-direct {v2, p1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     iput-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/j;->c:Landroid/widget/Button;
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/j;->c:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->v()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     new-instance v2, Landroid/widget/Button;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/Button;);
a=0;//     invoke-direct {v2, p1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Button;);
a=0;//     iput-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/j;->b:Landroid/widget/Button;
a=0;// 
a=0;//     iget-object v2, p0, Lnet/slidingmenu/tools/b/a/i/a/j;->b:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-static {}, Lnet/slidingmenu/tools/b/a/h/a;->u()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     new-instance v2, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v2, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V
a=0;// 
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/b/a/i/a/j;->b:Landroid/widget/Button;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Button;);
a=0;//     invoke-virtual {v2, v4, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     iget-object v4, p0, Lnet/slidingmenu/tools/b/a/i/a/j;->c:Landroid/widget/Button;
a=0;// 
a=0;//     invoke-virtual {v2, v4, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     invoke-virtual {v0, v2, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     invoke-direct {v1, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/RelativeLayout$LayoutParams;);
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Lnet/slidingmenu/tools/b/a/i/a/j;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method a()Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/j;->b:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method a(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/j;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/j;->a:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method b()Landroid/widget/Button;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lnet/slidingmenu/tools/b/a/i/a/j;->c:Landroid/widget/Button;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Button;);
a=0;//     return-object v0
a=0;// .end method
}}
