package com.twocloo.com.cn.utils; class DisplayUtil { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/DisplayUtil;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DisplayUtil.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 14
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/DisplayUtil;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static dip2px(FF)I
a=0;//     .locals 2
a=0;//     .param p0, "dipValue"    # F
a=0;//     .param p1, "scale"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     mul-float v0, p0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getDensity(Landroid/app/Activity;)F
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     new-instance v0, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 168
a=0;//     .local v0, "dm":Landroid/util/DisplayMetrics;
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 169
a=0;//     iget v1, v0, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public static getDrawableResource(Landroid/content/Context;Ljava/lang/String;)I
a=0;//     .locals 4
a=0;//     .param p0, "ctx"    # Landroid/content/Context;
a=0;//     .param p1, "name"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 128
a=0;//     .local v0, "res":Landroid/content/res/Resources;
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     const-string v2, "drawable"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 130
a=0;//     .local v1, "resId":I
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public static getFont1()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_font_size_1:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getFont2()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_font_size_2:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getFont3()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_font_size_3:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getFont4()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_font_size_4:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getFont5()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_font_size_5:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getFont6()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_font_size_6:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getFont7()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_font_size_7:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getScreenH(Landroid/app/Activity;)I
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     new-instance v0, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 154
a=0;//     .local v0, "dm":Landroid/util/DisplayMetrics;
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 156
a=0;//     iget v1, v0, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public static getScreenPix(Landroid/app/Activity;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 136
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 140
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 139
a=0;//     .local v0, "dm":Landroid/util/DisplayMetrics;
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/WindowManager;);
a=0;//     invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     .line 140
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "*"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getScreenPix(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .param p0, "act"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     if-nez p0, :cond_0
a=0;// 
a=0;//     .line 145
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 149
a=0;//     .end local p0    # "act":Landroid/content/Context;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 147
a=0;//     .restart local p0    # "act":Landroid/content/Context;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 148
a=0;//     .local v0, "dm":Landroid/util/DisplayMetrics;
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     check-cast p0, Landroid/app/Activity;
a=0;// 
a=0;//     .end local p0    # "act":Landroid/content/Context;
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/WindowManager;);
a=0;//     invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
a=0;// 
a=0;//     .line 149
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "*"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getScreenW(Landroid/app/Activity;)I
a=0;//     .locals 2
a=0;//     .param p0, "act"    # Landroid/app/Activity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     new-instance v0, Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/util/DisplayMetrics;);
a=0;//     invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V
a=0;// 
a=0;//     .line 161
a=0;//     .local v0, "dm":Landroid/util/DisplayMetrics;
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 163
a=0;//     iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public static px2dip(FF)I
a=0;//     .locals 2
a=0;//     .param p0, "pxValue"    # F
a=0;//     .param p1, "scale"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     div-float v0, p0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static px2sp(FF)I
a=0;//     .locals 2
a=0;//     .param p0, "pxValue"    # F
a=0;//     .param p1, "fontScale"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     div-float v0, p0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static readTextFontSpaceSize()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_font_space_size:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static readTextLeftRightSize()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_left_right_size:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static readTextTimeBottomSpaceSize()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_time_bottom_space_size:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static readTextTitleFondSize()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_title_font_size:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static readTextTitleSpace()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_left_right_size:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static readTextTitleTopSpaceSize()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_title_top_space_size:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static readTextTopBottomSize()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     invoke-static {}, Lcom/twocloo/base/common/CommonApp;->getInstance()Landroid/app/Application;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Application;);
a=0;//     invoke-virtual {v0}, Landroid/app/Application;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Lcom/twocloo/com/cn/R$dimen;->read_text_top_bottom_size:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static sp2px(FF)I
a=0;//     .locals 2
a=0;//     .param p0, "spValue"    # F
a=0;//     .param p1, "fontScale"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     mul-float v0, p0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/high16 v1, 0x3f000000    # 0.5f
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
