package com.actionbarsherlock.internal; class ResourcesCompat { void a() { int a;
a=0;// .class public final Lcom/actionbarsherlock/internal/ResourcesCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ResourcesCompat.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 10
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/actionbarsherlock/internal/ResourcesCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getResources_getBoolean(Landroid/content/Context;I)Z
a=0;//     .locals 9
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v8, 0x43f00000    # 480.0f
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 25
a=0;//     #v5=(Null);
a=0;//     sget v6, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/16 v7, 0xd
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-lt v6, v7, :cond_1
a=0;// 
a=0;//     .line 26
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v4, p1}, Landroid/content/res/Resources;->getBoolean(I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v7=(Integer);
a=0;//     return v4
a=0;// 
a=0;//     .line 29
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(One);v7=(PosByte);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 30
a=0;//     .local v1, "metrics":Landroid/util/DisplayMetrics;
a=0;//     #v1=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget v6, v1, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, v1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     div-float v3, v6, v7
a=0;// 
a=0;//     .line 31
a=0;//     .local v3, "widthDp":F
a=0;//     #v3=(Float);
a=0;//     iget v6, v1, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, v1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     div-float v0, v6, v7
a=0;// 
a=0;//     .line 32
a=0;//     .local v0, "heightDp":F
a=0;//     #v0=(Float);
a=0;//     cmpg-float v6, v3, v0
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gez v6, :cond_2
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 34
a=0;//     .local v2, "smallestWidthDp":F
a=0;//     :goto_1
a=0;//     #v2=(Float);
a=0;//     sget v6, Lcom/actionbarsherlock/R$bool;->abs__action_bar_embed_tabs:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne p1, v6, :cond_3
a=0;// 
a=0;//     .line 35
a=0;//     cmpl-float v6, v3, v8
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gez v6, :cond_0
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 38
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v2    # "smallestWidthDp":F
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v4=(One);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 32
a=0;//     #v2=(Float);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 40
a=0;//     .restart local v2    # "smallestWidthDp":F
a=0;//     :cond_3
a=0;//     #v6=(Integer);
a=0;//     sget v6, Lcom/actionbarsherlock/R$bool;->abs__split_action_bar_is_narrow:I
a=0;// 
a=0;//     if-ne p1, v6, :cond_4
a=0;// 
a=0;//     .line 41
a=0;//     cmpl-float v6, v3, v8
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ltz v6, :cond_0
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 42
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 46
a=0;//     :cond_4
a=0;//     #v4=(One);v6=(Integer);
a=0;//     sget v6, Lcom/actionbarsherlock/R$bool;->abs__action_bar_expanded_action_views_exclusive:I
a=0;// 
a=0;//     if-ne p1, v6, :cond_5
a=0;// 
a=0;//     .line 47
a=0;//     const/high16 v6, 0x44160000    # 600.0f
a=0;// 
a=0;//     cmpl-float v6, v2, v6
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ltz v6, :cond_0
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 48
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 52
a=0;//     :cond_5
a=0;//     #v4=(One);v6=(Integer);
a=0;//     sget v6, Lcom/actionbarsherlock/R$bool;->abs__config_allowActionMenuItemTextWithIcon:I
a=0;// 
a=0;//     if-ne p1, v6, :cond_6
a=0;// 
a=0;//     .line 53
a=0;//     cmpl-float v6, v3, v8
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gez v6, :cond_0
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 56
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 59
a=0;//     :cond_6
a=0;//     #v4=(One);v6=(Integer);
a=0;//     new-instance v4, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "Unknown boolean resource ID "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method public static getResources_getInteger(Landroid/content/Context;I)I
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0xd
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getInteger(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 90
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Integer);
a=0;//     return v2
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(PosByte);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 78
a=0;//     .local v0, "metrics":Landroid/util/DisplayMetrics;
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, v0, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-float v1, v2, v3
a=0;// 
a=0;//     .line 80
a=0;//     .local v1, "widthDp":F
a=0;//     #v1=(Float);
a=0;//     sget v2, Lcom/actionbarsherlock/R$integer;->abs__max_action_buttons:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne p1, v2, :cond_4
a=0;// 
a=0;//     .line 81
a=0;//     const/high16 v2, 0x44160000    # 600.0f
a=0;// 
a=0;//     cmpl-float v2, v1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_1
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 84
a=0;//     :cond_1
a=0;//     #v2=(Byte);
a=0;//     const/high16 v2, 0x43fa0000    # 500.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v2, v1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_2
a=0;// 
a=0;//     .line 85
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 87
a=0;//     :cond_2
a=0;//     #v2=(Byte);
a=0;//     const/high16 v2, 0x43b40000    # 360.0f
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v2, v1, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ltz v2, :cond_3
a=0;// 
a=0;//     .line 88
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 90
a=0;//     :cond_3
a=0;//     #v2=(Byte);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 93
a=0;//     :cond_4
a=0;//     #v2=(Integer);
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Unknown integer resource ID "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// .end method
}}
