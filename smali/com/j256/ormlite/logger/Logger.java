package com.j256.ormlite.logger; class Logger { void a() { int a;
a=0;// .class public Lcom/j256/ormlite/logger/Logger;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Logger.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ARG_STRING:Ljava/lang/String; = "{}"
a=0;// 
a=0;// .field private static final ARG_STRING_LENGTH:I
a=0;// 
a=0;// .field private static final UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final log:Lcom/j256/ormlite/logger/Log;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     const-string v0, "{}"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Lcom/j256/ormlite/logger/Logger;->ARG_STRING_LENGTH:I
a=0;// 
a=0;//     .line 25
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Lcom/j256/ormlite/logger/Log;)V
a=0;//     .locals 0
a=0;//     .param p1, "log"    # Lcom/j256/ormlite/logger/Log;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     #p0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     iput-object p1, p0, Lcom/j256/ormlite/logger/Logger;->log:Lcom/j256/ormlite/logger/Log;
a=0;// 
a=0;//     .line 30
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private appendArg(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .param p1, "sb"    # Ljava/lang/StringBuilder;
a=0;//     .param p2, "arg"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 598
a=0;//     sget-object v0, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     .line 609
a=0;//     .end local p2    # "arg":Ljava/lang/Object;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 600
a=0;//     .restart local p2    # "arg":Ljava/lang/Object;
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 602
a=0;//     const-string v0, "null"
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 603
a=0;//     :cond_1
a=0;//     invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 605
a=0;//     check-cast p2, [Ljava/lang/Object;
a=0;// 
a=0;//     .end local p2    # "arg":Ljava/lang/Object;
a=0;//     check-cast p2, [Ljava/lang/Object;
a=0;// 
a=0;//     invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 607
a=0;//     .restart local p2    # "arg":Ljava/lang/Object;
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private buildFullMessage(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/String;
a=0;//     .locals 5
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;//     .param p4, "arg2"    # Ljava/lang/Object;
a=0;//     .param p5, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 561
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const/16 v4, 0x80
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V
a=0;// 
a=0;//     .line 562
a=0;//     .local v3, "sb":Ljava/lang/StringBuilder;
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 563
a=0;//     .local v2, "lastIndex":I
a=0;//     #v2=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 565
a=0;//     .local v0, "argC":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);v4=(Integer);
a=0;//     const-string v4, "{}"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v4, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 567
a=0;//     .local v1, "argIndex":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v1, v4, :cond_0
a=0;// 
a=0;//     .line 593
a=0;//     invoke-virtual {p1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 594
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     return-object v4
a=0;// 
a=0;//     .line 571
a=0;//     :cond_0
a=0;//     #v4=(Byte);
a=0;//     invoke-virtual {p1, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 573
a=0;//     sget v4, Lcom/j256/ormlite/logger/Logger;->ARG_STRING_LENGTH:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v2, v1, v4
a=0;// 
a=0;//     .line 575
a=0;//     if-nez p5, :cond_4
a=0;// 
a=0;//     .line 576
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 577
a=0;//     invoke-direct {p0, v3, p2}, Lcom/j256/ormlite/logger/Logger;->appendArg(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 590
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 591
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 578
a=0;//     :cond_2
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     if-ne v0, v4, :cond_3
a=0;// 
a=0;//     .line 579
a=0;//     invoke-direct {p0, v3, p3}, Lcom/j256/ormlite/logger/Logger;->appendArg(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 580
a=0;//     :cond_3
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v0, v4, :cond_1
a=0;// 
a=0;//     .line 581
a=0;//     invoke-direct {p0, v3, p4}, Lcom/j256/ormlite/logger/Logger;->appendArg(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 585
a=0;//     :cond_4
a=0;//     #v4=(Integer);
a=0;//     array-length v4, p5
a=0;// 
a=0;//     if-ge v0, v4, :cond_1
a=0;// 
a=0;//     .line 586
a=0;//     aget-object v4, p5, v0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, v3, v4}, Lcom/j256/ormlite/logger/Logger;->appendArg(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;//     .locals 7
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p3, "msg"    # Ljava/lang/String;
a=0;//     .param p4, "arg0"    # Ljava/lang/Object;
a=0;//     .param p5, "arg1"    # Ljava/lang/Object;
a=0;//     .param p6, "arg2"    # Ljava/lang/Object;
a=0;//     .param p7, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 547
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/logger/Logger;->log:Lcom/j256/ormlite/logger/Log;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Log;);
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/logger/Log;->isLevelEnabled(Lcom/j256/ormlite/logger/Log$Level;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v1, p3
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v2, p4
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     move-object v3, p5
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     move-object v4, p6
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p7
a=0;// 
a=0;//     .line 548
a=0;//     #v5=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v5}, Lcom/j256/ormlite/logger/Logger;->buildFullMessage(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 549
a=0;//     .local v6, "fullMsg":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 550
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/logger/Logger;->log:Lcom/j256/ormlite/logger/Log;
a=0;// 
a=0;//     invoke-interface {v0, p1, v6}, Lcom/j256/ormlite/logger/Log;->log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 555
a=0;//     .end local v6    # "fullMsg":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 552
a=0;//     .restart local v6    # "fullMsg":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);v1=(Reference,Ljava/lang/String;);v2=(Reference,Ljava/lang/Object;);v3=(Reference,Ljava/lang/Object;);v4=(Reference,Ljava/lang/Object;);v5=(Reference,[Ljava/lang/Object;);v6=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/logger/Logger;->log:Lcom/j256/ormlite/logger/Log;
a=0;// 
a=0;//     invoke-interface {v0, p1, v6, p2}, Lcom/j256/ormlite/logger/Log;->log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public debug(Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 121
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 122
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public debug(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 128
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 129
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 135
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 136
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public debug(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;//     .param p4, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 142
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 143
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public debug(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p2
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 154
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public debug(Ljava/lang/Throwable;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 160
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 161
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public debug(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 167
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 168
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public debug(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 175
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public debug(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;//     .param p5, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 182
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public debug(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 192
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->DEBUG:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p3
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 193
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public error(Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 339
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->ERROR:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 340
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public error(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 346
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->ERROR:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 347
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 353
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->ERROR:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 354
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public error(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;//     .param p4, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 360
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->ERROR:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 361
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public error(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 367
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->ERROR:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p2
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 368
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public error(Ljava/lang/Throwable;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 374
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->ERROR:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 375
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public error(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 381
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->ERROR:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 382
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public error(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 388
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->ERROR:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 389
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public error(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;//     .param p5, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 395
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->ERROR:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 396
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public error(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 402
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->ERROR:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p3
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 403
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fatal(Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 409
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->FATAL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 410
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fatal(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 416
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->FATAL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 417
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fatal(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 423
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->FATAL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 424
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fatal(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;//     .param p4, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 430
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->FATAL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 431
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fatal(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 437
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->FATAL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p2
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 438
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fatal(Ljava/lang/Throwable;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 444
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->FATAL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 445
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fatal(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 451
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->FATAL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 452
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fatal(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 458
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->FATAL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 459
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fatal(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;//     .param p5, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 465
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->FATAL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 466
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public fatal(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 472
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->FATAL:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p3
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 473
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public info(Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 199
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->INFO:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 200
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public info(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 206
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->INFO:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 207
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public info(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 213
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->INFO:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 214
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public info(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;//     .param p4, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 220
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->INFO:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 221
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public info(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 227
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->INFO:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p2
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 228
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public info(Ljava/lang/Throwable;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->INFO:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 235
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public info(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->INFO:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 242
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public info(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->INFO:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 249
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public info(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;//     .param p5, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 255
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->INFO:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 256
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public info(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->INFO:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p3
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 263
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isLevelEnabled(Lcom/j256/ormlite/logger/Log$Level;)Z
a=0;//     .locals 1
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     iget-object v0, p0, Lcom/j256/ormlite/logger/Logger;->log:Lcom/j256/ormlite/logger/Log;
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Log;);
a=0;//     invoke-interface {v0, p1}, Lcom/j256/ormlite/logger/Log;->isLevelEnabled(Lcom/j256/ormlite/logger/Log$Level;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 479
a=0;//     #v2=(Null);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 480
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 486
a=0;//     #v2=(Null);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 487
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 493
a=0;//     #v2=(Null);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 494
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;//     .param p5, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 500
a=0;//     #v2=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 501
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 507
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p3
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 508
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p3, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 514
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 515
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p3, "msg"    # Ljava/lang/String;
a=0;//     .param p4, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 521
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 522
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p3, "msg"    # Ljava/lang/String;
a=0;//     .param p4, "arg0"    # Ljava/lang/Object;
a=0;//     .param p5, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 528
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 529
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p3, "msg"    # Ljava/lang/String;
a=0;//     .param p4, "arg0"    # Ljava/lang/Object;
a=0;//     .param p5, "arg1"    # Ljava/lang/Object;
a=0;//     .param p6, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 535
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 536
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public log(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "level"    # Lcom/j256/ormlite/logger/Log$Level;
a=0;//     .param p2, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p3, "msg"    # Ljava/lang/String;
a=0;//     .param p4, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 542
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p4
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 543
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public trace(Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 43
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->TRACE:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 44
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public trace(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 50
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->TRACE:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 51
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 57
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->TRACE:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public trace(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;//     .param p4, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 64
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->TRACE:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 65
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public trace(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->TRACE:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p2
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public trace(Ljava/lang/Throwable;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->TRACE:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 83
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public trace(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->TRACE:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 90
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public trace(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->TRACE:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 97
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public trace(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;//     .param p5, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->TRACE:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 104
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public trace(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->TRACE:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p3
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 115
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public warn(Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 269
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->WARNING:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 270
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public warn(Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 276
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->WARNING:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 277
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public warn(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 283
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->WARNING:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 284
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public warn(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "arg0"    # Ljava/lang/Object;
a=0;//     .param p3, "arg1"    # Ljava/lang/Object;
a=0;//     .param p4, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 290
a=0;//     #v2=(Null);
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->WARNING:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p2
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p3
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v7, v2
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 291
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public warn(Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "msg"    # Ljava/lang/String;
a=0;//     .param p2, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 297
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->WARNING:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p2
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 298
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public warn(Ljava/lang/Throwable;Ljava/lang/String;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 304
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->WARNING:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 305
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public warn(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 311
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->WARNING:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 312
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public warn(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->WARNING:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 319
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public warn(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "arg0"    # Ljava/lang/Object;
a=0;//     .param p4, "arg1"    # Ljava/lang/Object;
a=0;//     .param p5, "arg2"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 325
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->WARNING:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v4, p3
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     move-object v5, p4
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     move-object v6, p5
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 326
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public warn(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
a=0;//     .locals 8
a=0;//     .param p1, "throwable"    # Ljava/lang/Throwable;
a=0;//     .param p2, "msg"    # Ljava/lang/String;
a=0;//     .param p3, "argArray"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     sget-object v1, Lcom/j256/ormlite/logger/Log$Level;->WARNING:Lcom/j256/ormlite/logger/Log$Level;
a=0;// 
a=0;//     #v1=(Reference,Lcom/j256/ormlite/logger/Log$Level;);
a=0;//     sget-object v4, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v5, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     sget-object v6, Lcom/j256/ormlite/logger/Logger;->UNKNOWN_ARG:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Lcom/j256/ormlite/logger/Logger;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v3, p2
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     move-object v7, p3
a=0;// 
a=0;//     #v7=(Reference,[Ljava/lang/Object;);
a=0;//     invoke-direct/range {v0 .. v7}, Lcom/j256/ormlite/logger/Logger;->innerLog(Lcom/j256/ormlite/logger/Log$Level;Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 333
a=0;//     return-void
a=0;// .end method
}}
