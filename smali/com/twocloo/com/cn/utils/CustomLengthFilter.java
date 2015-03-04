package com.twocloo.com.cn.utils; class CustomLengthFilter { void a() { int a;
a=0;// .class public Lcom/twocloo/com/cn/utils/CustomLengthFilter;
a=0;// .super Landroid/text/InputFilter$LengthFilter;
a=0;// .source "CustomLengthFilter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Lcom/twocloo/com/cn/utils/CustomLengthFilter$onFullListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private listener:Lcom/twocloo/com/cn/utils/CustomLengthFilter$onFullListener;
a=0;// 
a=0;// .field private max:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 0
a=0;//     .param p1, "max"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 15
a=0;//     invoke-direct {p0, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V
a=0;// 
a=0;//     .line 16
a=0;//     #p0=(Reference,Lcom/twocloo/com/cn/utils/CustomLengthFilter;);
a=0;//     iput p1, p0, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->max:I
a=0;// 
a=0;//     .line 17
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getFwCharNum(Ljava/lang/String;)I
a=0;//     .locals 3
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 112
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 120
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 114
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 115
a=0;//     .local v1, "num":I
a=0;//     #v1=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->isFullwidthCharacter(C)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 117
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 115
a=0;//     :cond_2
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getLength(Ljava/lang/String;)I
a=0;//     .locals 3
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     invoke-static {p0}, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->isNull(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 92
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 100
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 94
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 95
a=0;//     .local v1, "len":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Char);
a=0;//     invoke-static {v2}, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->isFullwidthCharacter(C)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 97
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     .line 95
a=0;//     :cond_2
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isFullwidthCharacter(C)Z
a=0;//     .locals 2
a=0;//     .param p0, "ch"    # C
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 131
a=0;//     #v0=(Null);
a=0;//     const/16 v1, 0x20
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt p0, v1, :cond_1
a=0;// 
a=0;//     const/16 v1, 0x7f
a=0;// 
a=0;//     if-gt p0, v1, :cond_1
a=0;// 
a=0;//     .line 138
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Char);
a=0;//     return v0
a=0;// 
a=0;//     .line 134
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(PosByte);
a=0;//     const v1, 0xff61
a=0;// 
a=0;//     #v1=(Char);
a=0;//     if-lt p0, v1, :cond_2
a=0;// 
a=0;//     const v1, 0xff9f
a=0;// 
a=0;//     if-le p0, v1, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     :cond_2
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static isNull(Ljava/lang/String;)Z
a=0;//     .locals 1
a=0;//     .param p0, "str"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     if-eqz p0, :cond_0
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 79
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public filter(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;
a=0;//     .locals 8
a=0;//     .param p1, "source"    # Ljava/lang/CharSequence;
a=0;//     .param p2, "start"    # I
a=0;//     .param p3, "end"    # I
a=0;//     .param p4, "dest"    # Landroid/text/Spanned;
a=0;//     .param p5, "dstart"    # I
a=0;//     .param p6, "dend"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-interface {p4, p5, p6}, Landroid/text/Spanned;->subSequence(II)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->getLength(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 23
a=0;//     .local v3, "mlength":I
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p4}, Landroid/text/Spanned;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->getLength(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 24
a=0;//     .local v0, "dlength":I
a=0;//     #v0=(Integer);
a=0;//     invoke-interface {p1, p2, p3}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->getLength(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 25
a=0;//     .local v4, "slength":I
a=0;//     #v4=(Integer);
a=0;//     iget v6, p0, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->max:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int v7, v0, v3
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int v2, v6, v7
a=0;// 
a=0;//     .line 26
a=0;//     .local v2, "keep":I
a=0;//     #v2=(Integer);
a=0;//     if-gtz v2, :cond_1
a=0;// 
a=0;//     .line 28
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->listener:Lcom/twocloo/com/cn/utils/CustomLengthFilter$onFullListener;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/utils/CustomLengthFilter$onFullListener;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 29
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->listener:Lcom/twocloo/com/cn/utils/CustomLengthFilter$onFullListener;
a=0;// 
a=0;//     invoke-interface {v6}, Lcom/twocloo/com/cn/utils/CustomLengthFilter$onFullListener;->isFull()V
a=0;// 
a=0;//     .line 31
a=0;//     :cond_0
a=0;//     const-string v6, ""
a=0;// 
a=0;//     .line 52
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     return-object v6
a=0;// 
a=0;//     .line 32
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v5=(Uninit);v6=(Integer);
a=0;//     if-lt v2, v4, :cond_2
a=0;// 
a=0;//     .line 34
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 37
a=0;//     :cond_2
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 39
a=0;//     .local v5, "tmp":I
a=0;//     #v5=(Null);
a=0;//     move v1, p2
a=0;// 
a=0;//     .local v1, "index":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v5=(Integer);
a=0;//     if-le v1, p3, :cond_5
a=0;// 
a=0;//     .line 49
a=0;//     :cond_3
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->listener:Lcom/twocloo/com/cn/utils/CustomLengthFilter$onFullListener;
a=0;// 
a=0;//     #v6=(Reference,Lcom/twocloo/com/cn/utils/CustomLengthFilter$onFullListener;);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 50
a=0;//     iget-object v6, p0, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->listener:Lcom/twocloo/com/cn/utils/CustomLengthFilter$onFullListener;
a=0;// 
a=0;//     invoke-interface {v6}, Lcom/twocloo/com/cn/utils/CustomLengthFilter$onFullListener;->isFull()V
a=0;// 
a=0;//     .line 52
a=0;//     :cond_4
a=0;//     invoke-interface {p1, p2, v1}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 40
a=0;//     :cond_5
a=0;//     #v6=(Integer);
a=0;//     invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Char);
a=0;//     invoke-static {v6}, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->isFullwidthCharacter(C)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     .line 41
a=0;//     add-int/lit8 v5, v5, 0x2
a=0;// 
a=0;//     .line 45
a=0;//     :goto_2
a=0;//     if-gt v5, v2, :cond_3
a=0;// 
a=0;//     .line 39
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 43
a=0;//     :cond_6
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public setOnFullListener(Lcom/twocloo/com/cn/utils/CustomLengthFilter$onFullListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Lcom/twocloo/com/cn/utils/CustomLengthFilter$onFullListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     iput-object p1, p0, Lcom/twocloo/com/cn/utils/CustomLengthFilter;->listener:Lcom/twocloo/com/cn/utils/CustomLengthFilter$onFullListener;
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
}}
