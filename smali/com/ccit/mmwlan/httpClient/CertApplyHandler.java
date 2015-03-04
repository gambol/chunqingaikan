package com.ccit.mmwlan.httpClient; class CertApplyHandler { void a() { int a;
a=0;// .class public Lcom/ccit/mmwlan/httpClient/CertApplyHandler;
a=0;// .super Lorg/xml/sax/helpers/DefaultHandler;
a=0;// .source "CertApplyHandler.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private certApplyInfo:Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;// .field private certApplyInfoList:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/ccit/mmwlan/vo/CertApplyInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private isCurrent:Z
a=0;// 
a=0;// .field private sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;// .field private strRet:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 11
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V
a=0;// 
a=0;//     .line 14
a=0;//     #p0=(Reference,Lcom/ccit/mmwlan/httpClient/CertApplyHandler;);
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->certApplyInfoList:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 15
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 16
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->strRet:Ljava/lang/String;
a=0;// 
a=0;//     .line 17
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->isCurrent:Z
a=0;// 
a=0;//     .line 11
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public characters([CII)V
a=0;//     .locals 2
a=0;//     .param p1, "ch"    # [C
a=0;//     .param p2, "start"    # I
a=0;//     .param p3, "length"    # I
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xml/sax/SAXException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 29
a=0;//     iget-boolean v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->isCurrent:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 30
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     .line 31
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 33
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-super {p0, p1, p2, p3}, Lorg/xml/sax/helpers/DefaultHandler;->characters([CII)V
a=0;// 
a=0;//     .line 34
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public endDocument()V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xml/sax/SAXException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-super {p0}, Lorg/xml/sax/helpers/DefaultHandler;->endDocument()V
a=0;// 
a=0;//     .line 40
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;//     .locals 3
a=0;//     .param p1, "uri"    # Ljava/lang/String;
a=0;//     .param p2, "localName"    # Ljava/lang/String;
a=0;//     .param p3, "qName"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xml/sax/SAXException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 50
a=0;//     #v2=(Null);
a=0;//     invoke-super {p0, p1, p2, p3}, Lorg/xml/sax/helpers/DefaultHandler;->endElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 51
a=0;//     const-string v0, "resp"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "response"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     iput-boolean v2, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->isCurrent:Z
a=0;// 
a=0;//     .line 54
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->certApplyInfoList:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->certApplyInfo:Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     #v1=(Reference,Lcom/ccit/mmwlan/vo/CertApplyInfo;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 92
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 56
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-string v0, "result"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->certApplyInfo:Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/CertApplyInfo;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/ccit/mmwlan/vo/CertApplyInfo;->setResult(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 59
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->strRet:Ljava/lang/String;
a=0;// 
a=0;//     .line 60
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 62
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-string v0, "errormsg"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->certApplyInfo:Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/CertApplyInfo;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/ccit/mmwlan/vo/CertApplyInfo;->setErrormsg(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 67
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-string v0, "cert"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 69
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->strRet:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->certApplyInfo:Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/CertApplyInfo;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/ccit/mmwlan/vo/CertApplyInfo;->setCert(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 74
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 75
a=0;//     :cond_5
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-string v0, "randNum"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_6
a=0;// 
a=0;//     .line 77
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->strRet:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 81
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->certApplyInfo:Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/CertApplyInfo;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/ccit/mmwlan/vo/CertApplyInfo;->setRandNum(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 82
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 83
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const-string v0, "encData"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 84
a=0;//     const-string v0, "1"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->strRet:Ljava/lang/String;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->certApplyInfo:Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/CertApplyInfo;);
a=0;//     iget-object v1, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Lcom/ccit/mmwlan/vo/CertApplyInfo;->setEncData(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 89
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDataListSet()Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Lcom/ccit/mmwlan/vo/CertApplyInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     iget-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->certApplyInfoList:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public startDocument()V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xml/sax/SAXException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     invoke-super {p0}, Lorg/xml/sax/helpers/DefaultHandler;->startDocument()V
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->certApplyInfoList:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 100
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->sb:Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 101
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
a=0;//     .locals 1
a=0;//     .param p1, "uri"    # Ljava/lang/String;
a=0;//     .param p2, "localName"    # Ljava/lang/String;
a=0;//     .param p3, "qName"    # Ljava/lang/String;
a=0;//     .param p4, "attributes"    # Lorg/xml/sax/Attributes;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/xml/sax/SAXException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 107
a=0;//     const-string v0, "resp"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-string v0, "response"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 108
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->isCurrent:Z
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v0, Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/ccit/mmwlan/vo/CertApplyInfo;);
a=0;//     invoke-direct {v0}, Lcom/ccit/mmwlan/vo/CertApplyInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Lcom/ccit/mmwlan/vo/CertApplyInfo;);
a=0;//     iput-object v0, p0, Lcom/ccit/mmwlan/httpClient/CertApplyHandler;->certApplyInfo:Lcom/ccit/mmwlan/vo/CertApplyInfo;
a=0;// 
a=0;//     .line 112
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Lorg/xml/sax/helpers/DefaultHandler;->startElement(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xml/sax/Attributes;)V
a=0;// 
a=0;//     .line 113
a=0;//     return-void
a=0;// .end method
}}
