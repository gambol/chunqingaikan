package com.tencent.open.b; class a { void a() { int a;
a=0;// .class public Lcom/tencent/open/b/a;
a=0;// .super Landroid/widget/RelativeLayout;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/tencent/open/b/a$a;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final a:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private c:Z
a=0;// 
a=0;// .field private d:Lcom/tencent/open/b/a$a;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 16
a=0;//     const-class v0, Lcom/tencent/open/b/a;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Lcom/tencent/open/b/a;->a:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 36
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/tencent/open/b/a;);
a=0;//     iput-object v1, p0, Lcom/tencent/open/b/a;->b:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 20
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Lcom/tencent/open/b/a;->c:Z
a=0;// 
a=0;//     .line 33
a=0;//     iput-object v1, p0, Lcom/tencent/open/b/a;->d:Lcom/tencent/open/b/a$a;
a=0;// 
a=0;//     .line 38
a=0;//     iget-object v0, p0, Lcom/tencent/open/b/a;->b:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 39
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Lcom/tencent/open/b/a;->b:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 41
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Lcom/tencent/open/b/a$a;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iput-object p1, p0, Lcom/tencent/open/b/a;->d:Lcom/tencent/open/b/a$a;
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 61
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/b/a;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     .line 63
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Lcom/tencent/open/b/a;->b:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v2, p0, Lcom/tencent/open/b/a;->b:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget v2, v2, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 67
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/Display;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 69
a=0;//     #v0=(Integer);
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v2, p0, Lcom/tencent/open/b/a;->d:Lcom/tencent/open/b/a$a;
a=0;// 
a=0;//     #v2=(Reference,Lcom/tencent/open/b/a$a;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 75
a=0;//     const/16 v1, 0x64
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_1
a=0;// 
a=0;//     .line 77
a=0;//     iget-object v0, p0, Lcom/tencent/open/b/a;->d:Lcom/tencent/open/b/a$a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/b/a$a;);
a=0;//     iget-object v1, p0, Lcom/tencent/open/b/a;->b:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {v1}, Landroid/graphics/Rect;->height()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v1}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/b/a;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/tencent/open/b/a;->getPaddingTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     invoke-interface {v0, v1}, Lcom/tencent/open/b/a$a;->onKeyboardShown(I)V
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// 
a=0;//     .line 83
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(PosByte);v2=(Reference,Lcom/tencent/open/b/a$a;);
a=0;//     iget-object v0, p0, Lcom/tencent/open/b/a;->d:Lcom/tencent/open/b/a$a;
a=0;// 
a=0;//     #v0=(Reference,Lcom/tencent/open/b/a$a;);
a=0;//     invoke-interface {v0}, Lcom/tencent/open/b/a$a;->onKeyboardHidden()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
